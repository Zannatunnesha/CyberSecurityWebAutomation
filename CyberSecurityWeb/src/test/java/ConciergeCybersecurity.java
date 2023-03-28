import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ConciergeCybersecurity extends BaseDriver{
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get("https://main.techforing.com/");
		driver.manage().window().maximize();
		Thread.sleep(50000);
	}
	@Test(priority = 1)
	public void concieregecybersecurity() throws InterruptedException{
		Actions action = new Actions(driver);
		WebElement personal_cybersecurity = driver.findElement(By.cssSelector(".menu-link-lg"));
		WebElement concieregecybersecurity = driver.findElement(By.cssSelector(".menu-list [href='//main.techforing.com/mysecurity/concierge_cybersecurity/']"));
		action.moveToElement(personal_cybersecurity).perform();
		Thread.sleep(2000);
		concieregecybersecurity.click();
		Thread.sleep(1000);	
		//for window handling
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(90000);	

}}
