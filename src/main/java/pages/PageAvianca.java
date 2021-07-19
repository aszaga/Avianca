package pages;

import org.openqa.selenium.By;

public class PageAvianca {
	private static By btnCookies=By.xpath("//button[@name='cookies-confirm']");
	private static By btnInformacionVuelo = By.xpath("//a[contains(text(),'Solo ida')]");
    private static By txtFieldDesdeIdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//input[contains(@id,'pbOrigen')]");
    private static By txtFieldDesdeSoloIda = By.xpath("//div[contains(@id,'ida_1')]//input[contains(@id,'pbOrigen')]");
    private static By txtFieldLDestinoIdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//input[contains(@id,'pbDestino')]");
    private static By txtFieldHaciaSoloIda = By.xpath("//div[contains(@id,'ida_1')]//input[contains(@id,'pbDestino')]");
    private static By txtFieldPasajeroIdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//input[contains(@id,'pbPasajeros')]");
    private static By txtFieldPasajeroSoloIda = By.xpath("//div[contains(@id,'ida_1')]//input[contains(@id,'pbPasajeros')]");
    private static By btnBuscarTripAviancaIdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//button[contains(text(),'Buscar vuelos')]");
    private static By btnBuscarTripAviancaSoloIda = By.xpath("//div[contains(@id,'ida_1')]//button[contains(text(),'Buscar vuelos')]");
    private static By btnAdulotIdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//div[contains(@class,'controls')]//div[contains(@class,'plus') and @data-property='adults']");
    private static By btnNiñoIdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//div[contains(@class,'controls')]//div[contains(@class,'plus') and @data-property='child']");
    private static By btnBebeIdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//div[contains(@class,'controls')]//div[contains(@class,'plus') and @data-property='infant']");
    private static By btnAdultoSoloIda = By.xpath("//div[contains(@id,'ida_1')]//div[contains(@class,'controls')]//div[contains(@class,'plus') and @data-property='adults']");
    private static By btnNiñoSoloIda = By.xpath("//div[contains(@id,'ida_1')]//div[contains(@class,'controls')]//div[contains(@class,'plus') and @data-property='child']");
    private static By btnBebeSoloIda = By.xpath("//div[contains(@id,'ida_1')]//div[contains(@class,'controls')]//div[contains(@class,'plus') and @data-property='infant']");
    private static By btnCiudadPartidaAeropuerto = By.xpath("//div[contains(@data-source,'origin')]//ul[@role='list']//li");
    private static By btnCiudadDestinoAeropuerto = By.xpath("//div[contains(@data-source,'destination')]//ul[@role='list']//li");
    private static By txtFechaOrigenIdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//input[contains(@id,'pbFechas_1')]");
    private static By txtFechaDestinoIdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//input[contains(@id,'pbFechas_2')]");
    private static By txtFechaDestinoSoloIda = By.xpath("//div[contains(@id,'ida_1')]//input[contains(@id,'pbFechaIda_2') and @type='text']");
    private static By btnFechaCalendarioIdaYVuelta;
    private static By btnFechaCalendarioSoloIda;
    private static By btnPasajeroIdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//input[contains(@id,'pbPasajeros')]");
    private static By btnPasajeroSoloIda = By.xpath("//div[contains(@id,'ida_1')]//input[contains(@id,'pbPasajeros')]");
    
    
    
	public static By getBtnCookies() {
		return btnCookies;
	}
	public static void setBtnCookies(By btnCookies) {
		PageAvianca.btnCookies = btnCookies;
	}
	public static By getBtnInformacionVuelo() {
		return btnInformacionVuelo;
	}
	public static void setBtnInformacionVuelo(String OpcionVuelo) {
		PageAvianca.btnInformacionVuelo = By.xpath("//a[contains(text(),'"+OpcionVuelo+"')]");
	}
	public static By getBtnFechaCalendarioIdaYVuelta() {
		return btnFechaCalendarioIdaYVuelta;
	}
	public static void setBtnFechaCalendarioIdaYVuelta(String dia, String mes, String año) {
		PageAvianca.btnFechaCalendarioIdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//div[contains(@data-month,'"+año+"."+mes+"')]//div[@class='month']//div[text()='"+dia+"']");
        System.out.println("//div[contains(@id,'ida_regreso_1')]//div[contains(@data-month,'"+año+"."+mes+"')]//div[@class='month']//div[text()='"+dia+"']");
	}
	public static By getBtnFechaCalendarioSoloIda() {
		return btnFechaCalendarioSoloIda;
	}
	public static void setBtnFechaCalendarioSoloIda(String dia, String mes, String año) {
		PageAvianca.btnFechaCalendarioSoloIda = By.xpath("//div[contains(@id,'ida_1')]//div[contains(@data-month,'"+año+"."+mes+"')]//div[@class='month']//div[text()='"+dia+"']");
        System.out.println("//div[contains(@id,'ida_1')]//div[contains(@data-month,'"+año+"."+mes+"')]//div[@class='month']//div[text()='"+dia+"']");
	}
	public static By getTxtFieldDesdeIdaYVuelta() {
		return txtFieldDesdeIdaYVuelta;
	}
	public static By getTxtFieldDesdeSoloIda() {
		return txtFieldDesdeSoloIda;
	}
	public static By getTxtFieldLDestinoIdaYVuelta() {
		return txtFieldLDestinoIdaYVuelta;
	}
	public static By getTxtFieldHaciaSoloIda() {
		return txtFieldHaciaSoloIda;
	}
	public static By getTxtFieldPasajeroIdaYVuelta() {
		return txtFieldPasajeroIdaYVuelta;
	}
	public static By getTxtFieldPasajeroSoloIda() {
		return txtFieldPasajeroSoloIda;
	}
	public static By getBtnBuscarTripAviancaIdaYVuelta() {
		return btnBuscarTripAviancaIdaYVuelta;
	}
	public static By getBtnBuscarTripAviancaSoloIda() {
		return btnBuscarTripAviancaSoloIda;
	}
	public static By getBtnAdulotIdaYVuelta() {
		return btnAdulotIdaYVuelta;
	}
	public static By getBtnNiñoIdaYVuelta() {
		return btnNiñoIdaYVuelta;
	}
	public static By getBtnBebeIdaYVuelta() {
		return btnBebeIdaYVuelta;
	}
	public static By getBtnAdultoSoloIda() {
		return btnAdultoSoloIda;
	}
	public static By getBtnNiñoSoloIda() {
		return btnNiñoSoloIda;
	}
	public static By getBtnBebeSoloIda() {
		return btnBebeSoloIda;
	}
	public static By getBtnCiudadPartidaAeropuerto() {
		return btnCiudadPartidaAeropuerto;
	}
	public static By getBtnCiudadDestinoAeropuerto() {
		return btnCiudadDestinoAeropuerto;
	}
	public static By getTxtFechaOrigenIdaYVuelta() {
		return txtFechaOrigenIdaYVuelta;
	}
	public static By getTxtFechaDestinoIdaYVuelta() {
		return txtFechaDestinoIdaYVuelta;
	}
	public static By getTxtFechaDestinoSoloIda() {
		return txtFechaDestinoSoloIda;
	}
	public static By getBtnPasajeroIdaYVuelta() {
		return btnPasajeroIdaYVuelta;
	}
	public static By getBtnPasajeroSoloIda() {
		return btnPasajeroSoloIda;
	}


}
