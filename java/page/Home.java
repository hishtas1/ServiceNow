package page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;
import io.github.sukgu.Shadow;

public class Home extends ProjectSpecificMethod{
	public Home(ChromeDriver driver,Shadow shadow,ExtentTest node) {
		this.driver=driver;
		this.shadow=shadow;
		this.node=node;
	}
	public Home clickAll() {
		shadow.findElementByXPath("//div[text()='All']").click();
		return this;
	}
	public Home enterFilter() {
		WebElement filter = shadow.findElementByXPath("//input[@id='filter']");
		shadow.setImplicitWait(10);
		filter.click();
		filter.sendKeys("Callers");
		return this;
	}
	public Callers clickCallers() throws IOException {
		shadow.findElementByXPath("//span[text()='Callers']").click();
		reportStep("Caller is Loaded sucessfully","pass");
		//WebElement eleFrame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		//driver.switchTo().frame(eleFrame);
		return new Callers(driver,shadow,node);
	}
}
