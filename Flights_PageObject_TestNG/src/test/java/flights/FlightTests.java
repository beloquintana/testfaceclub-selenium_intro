package flights;

import base.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.ConfirmationPage;
import pages.PaymentPage;
import pages.ResultSearchPage;
import pages.SearchPage;

public class FlightTests extends BaseTest {

    @Test
    public void testFlightReservation(){
        SearchPage searchPage = new SearchPage(webDriver);
        Reporter.log("Paso1: Hacer la busqueda");
        ResultSearchPage resultSearchPage = searchPage.search(true,"Montevideo (MVD)","Buenos Aires (BUE)","06/25/2020",
                "09/10/2020","Primera","2");

        Reporter.log("Paso2: Seleccionar el primer vuelo");
        PaymentPage paymentPage = resultSearchPage.selectFirstTravel();

        Reporter.log("Paso3: Realizar pago");
        ConfirmationPage confirmationPage = paymentPage.payTravel("Maestro","456678952359","123","10","2024",
                "Juan","Patricio","Cuba");

        Reporter.log("Paso4: Validar mensaje de confirmacion");
        Assert.assertEquals(confirmationPage.getPanelMessage(),"Gracias por su reserva !!");
    }
}
