package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by osob on 2/14/2017.
 */
public class ContactPage extends AbstractPage{

    public ContactPage(WebDriver driverFF) {
        super(driverFF);
    }

   public ContactPage setNameField(String value){
       driverFF.findElement(By.name("name_field")).sendKeys(value);
       return new ContactPage(driverFF);
    }
    public ContactPage setAddressField(String value){
        driverFF.findElement(By.name("address_field")).sendKeys(value);
        return new ContactPage(driverFF);
    }

    public ContactPage setPostcodeField(String value){
        driverFF.findElement(By.name("postcode_field")).sendKeys(value);
        return new ContactPage(driverFF);
    }
    public ContactPage setEmailField(String value){
        driverFF.findElement(By.name("email_field")).sendKeys(value);
        return new ContactPage(driverFF);
    }
    public ContactConfirmPage submitForm(){
        driverFF.findElement(By.id("submit_message")).click();
        return new ContactConfirmPage(driverFF);
    }

}
