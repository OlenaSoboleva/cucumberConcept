package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by osob on 2/14/2017.
 */
public class LandingPage extends AbstractPage{


    public LandingPage(WebDriver driverFF) {
        super(driverFF);
    }

    public ContactPage navigateToContactPage(String link){
 //       driverFF.findElement(By.cssSelector("#rz-search input[placeholder='Поиск']")).sendKeys(stringsearch);
        driverFF.findElement(By.id(link.toLowerCase()+ "_link")).click();//contact_link
        return  new ContactPage(driverFF);

    }


}
