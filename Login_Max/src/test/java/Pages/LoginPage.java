package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By txt_username =By.id("login_usuario");	
	By txt_password =By.id("login_contraseña");	
	By btn_login =By.id("btn_label");
	
		
	public LoginPage(WebDriver driver){
		
		this.driver = driver;
		
			}
	
	public void enterUserName(String username){
		
		driver.findElement(txt_username).sendKeys(username);
		
	}

	public void enterPassword(String password) {
		
		driver.findElement(txt_password).sendKeys(password);
		
	}
	
	public void clickLogin() {
		
		driver.findElement(btn_login).click();
		
		
	}
}
