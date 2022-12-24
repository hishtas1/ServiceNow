package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;
import io.github.sukgu.Shadow;

public class Callers extends ProjectSpecificMethod{

	public Callers(ChromeDriver driver,Shadow shadow,ExtentTest node) {
		this.driver=driver;
		this.shadow=shadow;
		this.node=node;
	}
	public CreateCaller clickNew() {
		//WebElement eleFrame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		//driver.switchTo().frame(eleFrame);
		driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();
		return new CreateCaller(driver,shadow,node);
	}
	public Callers enterSearch(String fName) throws InterruptedException, IOException {
		//WebElement eleFrame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		//driver.switchTo().frame(eleFrame);
		WebElement search = driver.findElement(By.xpath("//input[@class='form-control']"));
		Thread.sleep(5000);
		//search.clear();
		search.sendKeys(fName,Keys.RETURN);
		reportStep("Find Caller is sucessfully","pass");
		return this;
	}
	public Callers clickPreViewButton() {
		driver.findElement(By.xpath("(//a[contains(@class,'btn btn-icon')])[2]")).click();
		return this;
	}
	public User clickOpenRecordButton() {
		driver.findElement(By.linkText("Open Record")).click();
		return new User(driver,shadow,node);
	}
}
