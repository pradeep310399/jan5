package salesforcepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import salesforcbase.CommonClass;

public class AccountsPage extends CommonClass {
	public AccountsPage clickNewButton() {
		driver.findElement(By.xpath("(//div[text()='New'])[1]")).click();
		return this;
		
	}
	public AccountsPage enterAccountName() throws InterruptedException {
		 Thread.sleep(8000);
		 driver.findElement(By.xpath("(//label[@class='slds-form-element__label slds-no-flex']/following::input)[1]")).sendKeys("Pradeepkumar N");
		 return this;

	}

	public AccountsPage selectOwnership() {
		 WebElement owner = driver.findElement(By.xpath("(//label[text()='Ownership']/following::input)[1]"));
		 driver.executeScript("arguments[0].click();", owner);
		 WebElement pub = driver.findElement(By.xpath("//span[@title='Public']"));
		 driver.executeScript("arguments[0].click();", pub);
		 return this;
	}
	public VerifyPage clickSaveButton() {
		WebElement save = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		 driver.executeScript("arguments[0].click();", save);
		 return new VerifyPage();

	}


}
