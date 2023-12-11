package Stepdefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

public class login {
	
	  WebDriver driver = new FirefoxDriver();
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		
		  driver.get("https://trendev.in/login");
		  System.out.println("URL OPened success"); 
		  driver.manage().window().maximize();
		  //driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.SECONDS);
		  //driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pratikbharti2023@gmail.com");
		 // driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		  //driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
		  //driver.close();
		  //System.out.println("Closed browser");
		  
	}

	@When("I enter valid credentials")
	public void i_enter_valid_credentials() {
		//driver.findElement(By.name("email")).sendKeys("pratikbharti2023@gmail.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pratikbharti2023@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		//driver.findElement(By.name("password")).sendKeys("123456");
		
		System.out.println("Username and password entered success"); 
	}
	

	@And("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
		System.out.println("Login success"); 
	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() {
		System.out.println("Navigated to dashboard");
		driver.close();
		driver.quit();
		System.out.println("Closed browser");
	}
	
}
