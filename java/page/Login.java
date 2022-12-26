package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;
import io.github.sukgu.Shadow;

public class Login extends ProjectSpecificMethod{
	public Login(ChromeDriver driver,Shadow shadow,ExtentTest node) {
		this.driver=driver;
		this.shadow=shadow;
		this.node=node;
	}
	public Login enterUserName(String uName) {
		driver.findElement(By.id("user_name")).sendKeys(uName);
		return this;
	}
	public Login enterPassword(String pWord) {
		driver.findElement(By.id("user_password")).sendKeys(pWord);
		return this;
	}
	public Home clickLoginButton() throws InterruptedException, IOException {
		driver.findElement(By.id("sysverb_login")).click();
		Thread.sleep(10000);
		reportStep("Logged in sucessfully","pass");
		return new Home(driver,shadow,node);
	}
}


