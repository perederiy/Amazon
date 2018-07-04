package org.itstep;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AmazonRegisterTest {

	private static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\drvs\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "E:\\drvs\\selenium\\geckodriver.exe");
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette", true);
		//driver = new FirefoxDriver();
		//System.setProperty("webdriver.opera.driver", "E:\\drvs\\selenium\\operadriver.exe");
		//OperaOptions options = new OperaOptions();
		//options.setBinary("C:\\Program Files\\Opera\\54.0.2952.41\\opera.exe");
		//driver = new OperaDriver(options);
		//System.setProperty("webdriver.edge.driver","E:\\drvs\\selenium\\MicrosoftWebDriver.exe");
		//driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	}

	@Test
	public void test() {
		//WebElement aElement = driver.findElement(By.cssSelector("a"
				//+ "[data-nav-ref='nav_ya_signin'][data-nav-role='signin']"
				//+ "[tabindex='61']"));
		WebElement aElement = driver.findElement(By.xpath("//a[data-nav-ref='nav_ya_signin'][data-nav-role='signin'][tabindex='61']"));
		String a = aElement.getAttribute("href");
		driver.get(a);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}
}
