package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import steps.StepsAvianca;

public class TestAvianca {
	@Steps
	StepsAvianca pasosAvianca = new StepsAvianca();

    @BeforeMethod
    public void before()  {

        SeleniumWebDriver.ChromeWebDriver("https://www.avianca.com/co/es/");
    }

    @Test
    public void test() {
       pasosAvianca.buscarVuelo();
    }
    @AfterMethod
    public void after()  {
        SeleniumWebDriver.driver.close();
    }

}
