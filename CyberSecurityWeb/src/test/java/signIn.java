
//import java.util.concurrent.TimeUnit;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class signIn extends BaseDriver {

	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get("https://main.techforing.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}

	@Test(priority = 1)
	public void test_login() throws InterruptedException {
		WebElement emailAddress = driver.findElement(By.xpath("//input[@id='id_login']"));
		emailAddress.sendKeys("zannat.techforing@gmail.com");
		Thread.sleep(2000);

		WebElement password = driver.findElement(By.xpath("//input[@id='id_password']"));
		password.sendKeys("ZannatTF@2023");
		Thread.sleep(2000);

		WebElement rememberMe = driver.findElement(By.xpath("//input[@id='id_remember']"));
		rememberMe.click();
		Thread.sleep(2000);

		WebElement login_btn = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		login_btn.click();
		Thread.sleep(20000);
		//window handle
//		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
//		Thread.sleep(5000);
		
		WebElement edit_btn = driver.findElement(By.cssSelector("[href='//main.techforing.com/account/profile_edit/']"));
		edit_btn.click();
		Thread.sleep(20000);
		WebElement full_Name = driver.findElement(By.cssSelector("#id_full_name"));
		full_Name.clear();
		full_Name.sendKeys("Zannatunnnesha");
		Thread.sleep(2000);
		WebElement ph_no = driver.findElement(By.cssSelector("#id_phone_number"));
		ph_no.clear();
		ph_no.sendKeys("+12125552368");
		Thread.sleep(2000);
		WebElement add_one = driver.findElement(By.cssSelector("#id_address_one"));
		add_one.clear();
		add_one.sendKeys("340 Shanakar dhanmondi");
		Thread.sleep(2000);
		WebElement add_two = driver.findElement(By.cssSelector("#id_address_two"));
		add_two.clear();
		add_two.sendKeys("940 Uttar Bogra Road, Barishal");
		Thread.sleep(2000);
		WebElement city = driver.findElement(By.cssSelector("#id_city"));
		city.clear();
		city.sendKeys("Dhaka");
		Thread.sleep(2000);
		WebElement zip_code = driver.findElement(By.cssSelector("#id_zipcode"));
		zip_code.clear();
		zip_code.sendKeys("1200");
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.cssSelector("#id_country"));
		country.clear();
		country.sendKeys("Bangladesh");
		Thread.sleep(2000);
		
		WebElement birth_date = driver.findElement(By.id("#id_birth_date"));
		birth_date.clear();
		  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		birth_date.sendKeys("01/11/1997");
		Thread.sleep(2000);
		
		WebElement gender = driver.findElement(By.cssSelector("#id_gender"));
		gender.sendKeys("Female");
		gender.click();
		Thread.sleep(5000);
		
		WebElement saveChanges = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		//for scrolling
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", saveChanges);
		saveChanges.click();
		Thread.sleep(2000);
		//FOR LOGOUT BUTTON
		WebElement logoutButton = driver.findElement(By.cssSelector("[href='//main.techforing.com/account/logout/']"));
		logoutButton.click();
		Thread.sleep(2000);
		
		//close the browser
		driver.quit();
	}
}
