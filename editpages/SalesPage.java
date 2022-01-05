package editpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import editbase.CommonEdit;
import salesforcbase.CommonClass;

public class SalesPage extends CommonEdit {
	public OpportunitiesPage clickOpportunitiesTab() {
		WebElement opp = driver.findElement(By.xpath("(//a[@title='Opportunities']/span)"));
		driver.executeScript("arguments[0].click();", opp);
		return new OpportunitiesPage();

	}

}
