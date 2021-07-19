package pages;

import org.openqa.selenium.By;

public class TicketAvianca {
	private static By btnSeleccionVuelo = By.xpath("//button[@class='select-cabin-button']");
	private static By lblTypeTripAvianca = By.xpath("//span[@class='ff-name ff-name-branded-fare']");
	private static By btnTypeTripAvianca = By.xpath("//button[@class='ff-price-container']");
	private static By btnRegresoWindowPrincipalA = By.xpath("//img[@alt='Avianca logo']//ancestor::a");
	private static By btnCloseWindowEmergent = By.xpath("//button[@aria-label='Cerrar ventana']");

	public static By getBtnSeleccionVuelo() {
		return btnSeleccionVuelo;
	}

	public static By getLblTypeTripAvianca() {
		return lblTypeTripAvianca;
	}

	public static By getBtnTypeTripAvianca() {
		return btnTypeTripAvianca;
	}

	public static By getBtnRegresoWindowPrincipalA() {
		return btnRegresoWindowPrincipalA;
	}

	public static By getBtnCloseWindowEmergent() {
		return btnCloseWindowEmergent;
	}

}
