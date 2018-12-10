package pageObject;

import org.openqa.selenium.WebDriver;

/**
 * Created by osob on 2/14/2017.
 */
public class AbstractPage {
    protected WebDriver driverFF;

    public AbstractPage(WebDriver driverFF) {
        this.driverFF = driverFF;
    }

    public LandingPage navigateToWebApp() {
        //      driverFF.navigate().to("http://rozetka.com.ua");
        driverFF.navigate().to("http://www.thetestroom.com/webapp/");
        return new LandingPage(driverFF);
    }

    public void closeDriver() {
        driverFF.quit();
    }

}
