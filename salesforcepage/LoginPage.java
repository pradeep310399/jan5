package salesforcepage;

import org.openqa.selenium.By;

import salesforcbase.CommonClass;

public class LoginPage extends CommonClass {
	public LoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys("earth@testleaf.com");
		return this;

	}
	public LoginPage enterpassword() {
		driver.findElement(By.id("password")).sendKeys("Bootcamp@123");
		return this;

	}
	public HomePage clickLogin() {
		driver.findElement(By.id("Login")).click();
		return new HomePage();

	}
	

}
