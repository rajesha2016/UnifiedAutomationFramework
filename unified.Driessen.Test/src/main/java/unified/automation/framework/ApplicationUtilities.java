package unified.automation.framework;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class ApplicationUtilities {

		public static final String USERNAME = "rajeshakumarmoha2";
	  public static final String AUTOMATE_KEY = "ZT8Cus8tzGnxtjYbvvAa";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	  public static void main(String[] args) throws Exception {

	    DesiredCapabilities caps = DesiredCapabilities.firefox();
	    caps.setCapability("Platform", "WINDOWS");
	    caps.setCapability("browserstack.debug", "true");

	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	    driver.get("http://www.google.com");
	    WebElement element = driver.findElement(By.name("q"));

	    element.sendKeys("BrowserStack");
	    element.submit();

	    System.out.println(driver.getTitle());
	    driver.quit();

	  }
}
