package EmployeeDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drapDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:4200/");
		driver.findElement(By.xpath("/html/body/app-root/div/nav/ul/li[2]/button")).click();
        driver.findElement(By.xpath("/html/body/app-root/div/app-employee/app-show-emp/button")).click();
        WebElement downlist=driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[2]/app-add-edit-emp/div/div[1]/div[2]/select"));
        Select drop=new Select(downlist);
        drop.selectByIndex(0);
        WebElement txt=drop.getFirstSelectedOption();
        System.out.println(txt.getText());

	}

}
