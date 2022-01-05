package editpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import editbase.CommonEdit;


public class OpportunitiesPage extends CommonEdit {
	public OpportunitiesPage searchName() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys("salesforce Automation by pradeepkumar N",Keys.ENTER);
		Thread.sleep(5000);
		return this;
		
	}
	public OpportunitiesPage clickDropdown() throws InterruptedException {
		driver.findElement(By.xpath("(//span[text()='Show Actions']/parent::span)[1]")).click();
		Thread.sleep(5000);
		 return this;

	}

	public OpportunitiesPage clickEditOption() {
		driver.findElement(By.xpath("//div[text()='Edit']/parent::a")).click();
		 return this;
	}
	public OpportunitiesPage editDate() {
		WebElement date = driver.findElement(By.xpath("//input[@name='CloseDate']"));
		date.clear();
		date.sendKeys("12/22/2021");
		return this;

	}
	public OpportunitiesPage editStage() {
		WebElement findElement2 = driver.findElement(By.xpath("//label[text()='Stage']/following::input[1]"));
		findElement2.click();
		WebElement perceptionanalysis = driver.findElement(By.xpath("//span[contains(@class,'slds-media')]/following::span[text()='Perception Analysis']"));
		perceptionanalysis.click();
		String attribute = perceptionanalysis.getAttribute("title");
		System.out.println(attribute);
		return this;

	}
	public OpportunitiesPage enterDeliveryStatus() throws InterruptedException {
		Thread.sleep(5000);
		WebElement delivery = driver.findElement(By.xpath("//span[contains(@class,'slds-form')]/following::label[text()='Delivery/Installation Status']"));
		driver.executeScript("arguments[0].click();", delivery);
		WebElement progress = driver.findElement(By.xpath("(//span[text()='In progress'])"));
		driver.executeScript("arguments[0].click();", progress);

		return this;

	}
	public OpportunitiesPage enterDescription() throws InterruptedException {
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])")).sendKeys("SalesForce");
		return this;

	}
	public VerifyPage clickSave() throws InterruptedException {
		driver.findElement(By.xpath("(//button[@name='SaveEdit'])")).click();
		return new VerifyPage();

	}
	


}
