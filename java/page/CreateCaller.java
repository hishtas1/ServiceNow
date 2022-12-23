package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;
import io.github.sukgu.Shadow;

public class CreateCaller extends ProjectSpecificMethod{

	public CreateCaller(ChromeDriver driver,Shadow shadow,ExtentTest node) {
		this.driver=driver;
		this.shadow=shadow;
		this.node=node;
	}
	public CreateCaller enterFirstName(String fName) {
		driver.findElement(By.xpath("//input[@id='sys_user.first_name']")).sendKeys(fName);
		return this;
	}
	public CreateCaller enterLastName(String lName) {
		driver.findElement(By.id("sys_user.last_name")).sendKeys(lName);
		return this;
	}
	public CreateCaller enterEmailID(String email) {
		driver.findElement(By.id("sys_user.email")).sendKeys(email);
		return this;
	}
	public CreateCaller enterTitle(String title) {
		driver.findElement(By.id("sys_user.title")).sendKeys(title);
		return this;
	}
	public CreateCaller enterBusinessPhone(String bPhone) {
		driver.findElement(By.id("sys_user.phone")).sendKeys(bPhone);
		return this;
	}
	public CreateCaller enterMobilePhone(String mPhone) {
		driver.findElement(By.id("sys_user.mobile_phone")).sendKeys(mPhone);
		return this;
	}
	public Callers clickSubmitBotton() throws InterruptedException, IOException {
		reportStep("Details are entered sucessfully","pass");
		driver.findElement(By.id("sysverb_insert_bottom")).click();
		Thread.sleep(3000);
		reportStep("Caller is created sucessfully","pass");
		return new Callers(driver,shadow,node);
	}
}