package StepsDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsMax {
	
	WebDriver driver = null;
	
	@SuppressWarnings("deprecation")
	@Given("Opens browser")
	public void opens_browser() {

		System.out.println("Inside step - browser is open");
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Hitss/Documents/Eclipse/practica/src/test/resources/Drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@And("User is in the login page")
	public void user_is_in_the_login_page() {

		System.out.println("Inside step - user is in the login page");

		driver.navigate().to("https://www.saucedemo.com/");

	}

	@When("user enters valid user name and password")
	public void user_enters_valid_user_name_and_password() {
	   
		System.out.println("Inside step - user enters valid user name and password");
	    
		driver.findElement(By.id("name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
	}

	@And("clics on login button")
	public void clics_on_login_button() {
		
		System.out.println("Inside step - clics on login button");
		
		driver.findElement(By.id("login")).click();
		
	}

	@Then("user is directed to the home page")
	public void user_is_directed_to_the_home_page() {
		
		System.out.println("Inside step - user is directed to the home page");
		
		driver.findElement(By.id("Logout")).click();
		
		driver.close();
		driver.quit();
		
	}

}