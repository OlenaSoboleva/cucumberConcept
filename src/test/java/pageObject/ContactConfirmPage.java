package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by osob on 2/14/2017.
 */
public class ContactConfirmPage extends AbstractPage{


    public ContactConfirmPage(WebDriver driverFF) {
        super(driverFF);
    }

    public String getPageTitle(){
        return driverFF.findElement(By.cssSelector(".content h1")).getText();
    }


}
