package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.GoogleChromeDriver;

import java.io.IOException;

public class BusquedaProductoStepsDefinitions {
    DafitiSteps dafiti = new DafitiSteps();


    @Given("^Navego en Dafiti$")
    public void abrirPagina(){
        dafiti.abrirPagina();

    }
    @When("^Busco '(.*)' los en Dafiti$")
    public void escriboEnElBuscador  (String producto) throws IOException {


        dafiti.buscarElementoEnDafiti(producto);
        dafiti.validarProductoDafiti(producto);


    }

    @Then("^Obtengo y Valido los Resultados$")
    public void validoResultados(){

        GoogleChromeDriver.driver.quit();

    }


}
