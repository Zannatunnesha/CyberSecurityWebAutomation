import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class cyberThreat extends BaseDriver{
	@Test(priority = 0)
	public void openUrl() throws InterruptedException{
		driver.get("https://main.techforing.com/");
		driver.manage().window().maximize();
		Thread.sleep(50000);
	}
	@Test(priority = 1)
	public void test_cyberThreat() throws InterruptedException{
		Actions action = new Actions(driver);
		WebElement business_cy = driver.findElement(By.cssSelector(".menu-link[href='//main.techforing.com/enterprise_cybersecurity/']"));
		WebElement cyberThreat = driver.findElement(By.cssSelector("[href='//main.techforing.com/cyber_threat_intelligence/'][comment]"));
		
		action.moveToElement(business_cy).perform();
		Thread.sleep(2000);
		cyberThreat.click();
		//for window handling
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(90000);
		//stay ahead of cyber threat
		WebElement cyberThreat_btn = driver.findElement(By.cssSelector(".risk-banner-btn"));
		cyberThreat_btn.click();
		Thread.sleep(20000);
		//download_ebook
		WebElement download1 = driver.findElement(By.cssSelector(".glide__slides > li:nth-of-type(2) .rs-btn"));
		download1.click();
		Thread.sleep(20000);
		//find out the form and download
		WebElement full_Name = driver.findElement(By.cssSelector("#fullname"));
		full_Name.sendKeys("Zannatunnesha");
		Thread.sleep(20000);
		WebElement business_email = driver.findElement(By.cssSelector("#email"));
		business_email.sendKeys("zannat.techforing@gmail.com");
		Thread.sleep(20000);
		WebElement ph_nbr = driver.findElement(By.cssSelector("#phone"));
		ph_nbr.sendKeys("01706377316");
		Thread.sleep(20000);
		WebElement company_name = driver.findElement(By.cssSelector("#comp"));
		company_name.sendKeys("Techforing");
		Thread.sleep(20000);
		WebElement position = driver.findElement(By.cssSelector("#position"));
		position.sendKeys("Junior SQA");
		Thread.sleep(20000);
		WebElement promotional = driver.findElement(By.cssSelector("#newsletter"));
		promotional.click();
		Thread.sleep(20000);
		WebElement download_btn = driver.findElement(By.cssSelector("#submit-btn"));
		download_btn.click();
		Thread.sleep(20000);
		
		driver.navigate().back();
		Thread.sleep(2000);
	    driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		
		//see all success stories
		WebElement success_stories = driver.findElement(By.cssSelector("[href='/testimonial/']"));
		success_stories.click();
		Thread.sleep(20000);
		//get our services
		WebElement get_services = driver.findElement(By.cssSelector(".fa-arrow-right"));
		get_services.click();
		Thread.sleep(20000);
		//request call back
		WebElement req_call = driver.findElement(By.cssSelector("#request-btn"));
		req_call.click();
		Thread.sleep(20000);
		WebElement req_fullName = driver.findElement(By.cssSelector(".b24-form-field-string .b24-form-control"));
		req_fullName.sendKeys("Zannatunnesha");
		Thread.sleep(20000);
		WebElement req_email = driver.findElement(By.cssSelector("[name='email']"));
		req_email.sendKeys("zannat.techoring@gamil.com");
		Thread.sleep(20000);
		WebElement req_services = driver.findElement(By.cssSelector(".b24-form-dropdown-container > div > div:nth-of-type(1) span"));
		req_services.sendKeys("Personal CyberSecurity");
		Thread.sleep(20000);
		WebElement req_message = driver.findElement(By.cssSelector(".fa-arrow-right"));
		req_message.sendKeys("I am ok with your sservices");
		Thread.sleep(20000);
		WebElement req_submitbtn = driver.findElement(By.cssSelector("[type='submit']"));
		get_services.click();
		Thread.sleep(20000);
		driver.navigate().back();
		Thread.sleep(2000);
	    driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
//virtual meeting
		WebElement virtual_meeting = driver.findElement(By.cssSelector("#virtual-btn"));
		virtual_meeting.click();
		Thread.sleep(20000);
	    WebElement sche_meeting = driver.findElement(By.cssSelector(".reserve"));
	    sche_meeting.click();
		Thread.sleep(20000);
		WebElement call_here = driver.findElement(By.cssSelector("body"));
		call_here.click();
		Thread.sleep(20000);
		WebElement vir_fullName = driver.findElement(By.cssSelector("[type='string']"));
		vir_fullName.sendKeys("Zannatunnesha");
		Thread.sleep(20000);
		
		WebElement vir_email = driver.findElement(By.cssSelector("[name='email']"));
		vir_email.sendKeys("zannat.techforing@gmail.com");
		Thread.sleep(20000);
		
		WebElement vir_message = driver.findElement(By.cssSelector("textarea"));
		vir_message.sendKeys("Zannatunnesha");
		Thread.sleep(20000);
		
		WebElement vir_submitbtn = driver.findElement(By.cssSelector("[type='submit']"));
		vir_submitbtn.click();
		Thread.sleep(20000);
		driver.navigate().back();
		Thread.sleep(2000);
	    driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//important resources
		WebElement read_more1 = driver.findElement(By.cssSelector("[href='https://main.techforing.com/resources/articles/cyber-attacks-on-financial-services/']"));
		read_more1.click();
		Thread.sleep(20000);
		driver.navigate().back();
		Thread.sleep(2000);
	    driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement read_more2 = driver.findElement(By.cssSelector("[href='https://main.techforing.com/resources/articles/cybersecurity-tips-for-work-from-home/']"));
		read_more2.click();
		Thread.sleep(20000);
		driver.navigate().back();
		Thread.sleep(2000);
	    driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement read_more3 = driver.findElement(By.cssSelector("[href='https://main.techforing.com/resources/articles/how-to-design-a-secure-office-network/']"));
		read_more3.click();
		Thread.sleep(20000);
		}
}
