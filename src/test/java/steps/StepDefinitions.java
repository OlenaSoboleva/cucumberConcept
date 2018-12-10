package steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import pageObject.ContactConfirmPage;
import pageObject.ContactPage;
import pageObject.LandingPage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.id;

public class StepDefinitions {

    WebDriver driverFF = new InternetExplorerDriver();
    //  public WebDriver driverFF=null;
    LandingPage landingPage;
    ContactPage contactPage;
    ContactConfirmPage contactConfirmationPage;

//    LandingPage landingPage= new LandingPage(driverFF);

//    @Before
//    public void beforeScenario() {
// //       System.setProperty("webdriver.chrome.driver", "C:\\Users\\osob\\workspace\\cucumber jars\\chromedriver_win32\\chromedriver.exe");
// //       System.setProperty("webdriver.firefox.driver", "C:\\Users\\osob\\workspace\\cucumber jars\\geckodriver-v0.14.0-win64\\geckodriver.exe");
//  //      driverFF= new FirefoxDriver();
//      //  driverFF= new InternetExplorerDriver();
//    }
//    @After
//    public void afterScenario() {
//
//        driverFF.quit();
//    }


    @Given("^I am on zoo site$")
    public void i_am_on_zoo_site() throws Throwable {
        //    driverFF.navigate().to("http://www.thetestroom.com/webapp/");
        landingPage = new LandingPage(driverFF);
        landingPage.navigateToWebApp();

    }

    @Given("^I click on \"([^\"]*)\"$")
    public void I_click_on(String link) throws Throwable {
        //       driverFF.findElement(id(link.toLowerCase()+ "_link")).click();
        contactPage = landingPage.navigateToContactPage(link);

    }

    @When("^I enter \"([^\"]*)\" into the name field$")
    public void i_enter_into_the_name_field(String value) throws Throwable {
//        driverFF.findElement(By.name("name_field")).sendKeys(value);
        contactPage.setNameField(value);
    }

    @When("^I enter \"([^\"]*)\" into the address field$")
    public void i_enter_into_the_address_field(String value) throws Throwable {
//        driverFF.findElement(By.name("address_field")).sendKeys(value);
        contactPage.setAddressField(value);
    }

    @When("^I enter \"([^\"]*)\" into the postcode field$")
    public void i_enter_into_the_postcode_field(String value) throws Throwable {
//        driverFF.findElement(By.name("postcode_field")).sendKeys(value);
        contactPage.setPostcodeField(value);
    }

    @When("^I enter \"([^\"]*)\" into the email field$")
    public void i_enter_into_the_email_field(String value) throws Throwable {
//        driverFF.findElement(By.name("email_field")).sendKeys(value);
        contactPage.setEmailField(value);
    }

    @When("^I submit the contact form$")
    public void i_submit_the_contact_form() throws Throwable {
//        driverFF.findElement(id("submit_message")).click();
        contactConfirmationPage = contactPage.submitForm();

    }

    @Then("^I check I am on the Confirmation page$")
    public void i_check_I_am_on_the_Confirmation_page() throws Throwable {
//        Assert.assertTrue("Not on contact confirmation page",
//                       driverFF.findElement(By.cssSelector(".content h1")).getText().contains("We have your message"));
        Assert.assertTrue(contactConfirmationPage.getPageTitle().contains("We have your message"));

    }

    @Then("^I close the browser$")
    public void CloseBrowser() throws Throwable {
        //  driverFF.quit();
        contactConfirmationPage.closeDriver();
    }

/*
    @Given("^I am on rozetka$")
    public void iAmOnRozetka() throws Throwable {
    //    driverFF.navigate().to("http://rozetka.com.ua");
    }

    @Given("^I Enter \"([^\"]*)\" to Search Button$")
    public void EnterValueToSearchInput(String stringsearch) throws Throwable {
  //      driverFF.findElement(By.cssSelector("#rz-search input[placeholder='Поиск']")).sendKeys(stringsearch);
    }

    @When("^I click on the Search Button$")
    public void shouldclickOnSearchButton() throws Throwable {
        driverFF.findElement(By.name("rz-search-button")).click();
    }

    @Then("^I check to see the result \"([^\"]*)\"$")
    public void checkResult(String stringsearch) throws Throwable {
        Assert.assertTrue("Not on contact confirmation page",
                driverFF.getCurrentUrl().contains(stringsearch)); //"http://rozetka.com.ua/"));

    }

    @Then("^I close the browser$")
    public void CloseBrowser() throws Throwable {
//        driverFF.manage().window().maximize();
//        driverFF.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

*/
}
