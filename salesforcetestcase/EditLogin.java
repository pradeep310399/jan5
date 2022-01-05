package salesforcetestcase;

import org.testng.annotations.Test;

import editbase.CommonEdit;
import editpages.LoginPage;

public class EditLogin extends CommonEdit{
	@Test
	public void runEdit() throws InterruptedException {
		LoginPage LP = new LoginPage();
		LP.enterUsername()
		.enterpassword()
		.clickLogin()
		.clickToggle()
		.clickViewall()
		.clickSales()
		.clickOpportunitiesTab()
		.searchName()
		.clickDropdown()
		.clickEditOption()
		.editDate()
		.editStage()
		.enterDeliveryStatus()
		.enterDescription()
		.clickSave()
		.verifyPerceptionAnalysis();

	}

}
