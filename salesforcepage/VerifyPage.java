package salesforcepage;

import org.openqa.selenium.By;

import salesforcbase.CommonClass;

public class VerifyPage extends CommonClass{
	public VerifyPage verifyAccountName() {
		String text = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		 System.out.println(text);
		 if(text.contains("Opportunities Salesforce Automation by Pradeepkumar N was saved")) {
			 System.out.println("opportunities verified");
		 }else {
			 System.out.println("other");
		 }
		 return this;
	}

}
