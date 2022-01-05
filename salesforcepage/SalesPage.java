package salesforcepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import salesforcbase.CommonClass;

public class SalesPage extends CommonClass {
	public AccountsPage clickAccountTab() {
		WebElement accounts = driver.findElement(By.xpath("//span[text()='Accounts']"));
		 driver.executeScript("arguments[0].click();", accounts);
		 return new AccountsPage();

	}

}
