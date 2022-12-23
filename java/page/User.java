package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;
import io.github.sukgu.Shadow;

public class User extends ProjectSpecificMethod{
	public User(ChromeDriver driver, Shadow shadow,ExtentTest node) {
		this.driver=driver;
		this.shadow=shadow;
		this.node=node;
	}
	public User updateBusinessPhone(String ubNumber) {
		WebElement updatePhoneNumber = driver.findElement(By.id("sys_user.phone"));
		updatePhoneNumber.clear();
		updatePhoneNumber.sendKeys(ubNumber);
		return this;
	}
	public Callers clickUpdateButton() {
		driver.findElement(By.xpath("//button[@id='sysverb_update_bottom']")).click();
		return new Callers(driver, shadow,node);
	}
	public User clickDeleteButton() {
		driver.findElement(By.xpath("//button[@id='sysverb_delete_bottom']")).click();
		return this;
	}
	public Callers acceptWarrning() {
		driver.findElement(By.id("ok_button")).click();
		return new Callers(driver, shadow,node);
	}
}
