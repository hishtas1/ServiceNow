package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import page.Login;

public class UpdateCaller extends ProjectSpecificMethod{
	@BeforeTest
	public void setUp() {
		filename="Update";
		testName="Update Caller Test";
		testDescription="Update Caller Test";
		testAuthor="Sathish";
		testType="Smoke";
	}
	@Test(dataProvider = "fetchData")
	public void updateContact(String uName,String pWord,String fName,String ubNumber) throws InterruptedException, IOException {
		Login login = new Login(driver, shadow,node);
		login.enterUserName(uName).enterPassword(pWord).clickLoginButton()
		.clickAll().enterFilter().clickCallers()
		.enterSearch(fName).clickPreViewButton().clickOpenRecordButton()
		.updateBusinessPhone(ubNumber).clickUpdateButton().enterSearch(fName);
	}
}
