package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import page.Login;

public class CreateNewCaller extends ProjectSpecificMethod{
	@BeforeTest
	public void setUp() {
		filename="Create";
		testName="Create Caller Test";
		testDescription="Create Caller Test";
		testAuthor="Sathish";
		testType="Smoke";
	}
	@Test(dataProvider = "fetchData")
	public void newContact(String uName,String pWord,String fName,String lName,String email,String title,String bPhone,String mPhone) throws InterruptedException, IOException {
		Login login = new Login(driver,shadow,node);
		login.enterUserName(uName).enterPassword(pWord).clickLoginButton()
		.clickAll().enterFilter().clickCallers()
		.clickNew().enterFirstName(fName).enterLastName(lName).enterTitle(title).enterEmailID(email)
		.enterMobilePhone(mPhone).enterBusinessPhone(bPhone).clickSubmitBotton()
		.enterSearch(fName);
	}
}
