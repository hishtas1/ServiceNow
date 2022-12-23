package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import page.Login;

public class DeleteCaller extends ProjectSpecificMethod{
	@BeforeTest
	public void setUp() {
		filename="Delete";
		testName="Delete Caller Test";
		testDescription="Delete Caller Test";
		testAuthor="Sathish";
		testType="Smoke";
	}
	@Test(dataProvider = "fetchData")
	public void deleteCaller(String uName,String pWord,String fName) throws InterruptedException, IOException {
		Login login = new Login(driver, shadow,node);
		login.enterUserName(uName).enterPassword(pWord).clickLoginButton()
		.clickAll().enterFilter().clickCallers()
		.enterSearch(fName).clickPreViewButton().clickOpenRecordButton()
		.clickDeleteButton().acceptWarrning().enterSearch(fName);
	}
}
