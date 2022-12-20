package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.SignUpPageObjects;

public class SignUpStepDefs {
    @Given("^Pepito wants to have an account$")
    public void pepito_wants_to_have_an_account(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/pc/chromedriver");
        WebDriver driver = new ChromeDriver();
        SignUpPageObjects signUpPageObjects = new SignUpPageObjects(driver);
        signUpPageObjects.go("https://demo.automationtesting.in/Register.html");
        signUpPageObjects.writeFirstName("Voknos");
        signUpPageObjects.writeLastName("Nos");
        signUpPageObjects.writeAddress("Santa lucia 1007");
        signUpPageObjects.writeEmailAdress("voknos@gmail.com");
        signUpPageObjects.writePhone("+56123456789");
    }
    @When("^he sends required information to get the account$")
    public void he_sends_required_information_to_get_the_accounts(){

    }
    @Then("^he should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created(){

    }


}
