package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodrier.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.shaadi.com");
	Thread.sleep(2000);
//	driver.getTitle();
//	Thread.sleep(2000);
	driver.quit();
}
}