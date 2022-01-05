package salesforcepage;

import org.openqa.selenium.By;

import salesforcbase.CommonClass;

public class HomePage extends CommonClass{
	public HomePage clickToggle() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		return this;

	}
	public HomePage clickViewall() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		return this;

	}
	public SalesPage clickSales() {
		driver.findElement(By.xpath("//p[text()='Manage your sales process with accounts, leads, opportunities, and...']")).click();
		return new SalesPage();

	}

}
