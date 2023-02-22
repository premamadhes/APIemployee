package EmployeeDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addEmployee {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:4200/");
		driver.findElement(By.xpath("/html/body/app-root/div/nav/ul/li[2]/button")).click();
        driver.findElement(By.xpath("/html/body/app-root/div/app-employee/app-show-emp/button")).click();
        WebElement TextTitle= driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[2]/app-add-edit-emp/div/div[1]/label[1]"));
        String text=TextTitle.getText();
        System.out.println(text);
        //driver.close();
        
//		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[2]/app-add-edit-emp/div/div[1]/div[1]/input")).clear();
//		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[2]/app-add-edit-emp/div/div[1]/div[1]/input")).sendKeys(" ");
//		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[2]/app-add-edit-emp/div/div[1]/div[1]/input")).clear();
//		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[2]/app-add-edit-emp/div/div[1]/div[1]/input")).sendKeys("1234");
//		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[2]/app-add-edit-emp/div/div[1]/div[1]/input")).clear();
//		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[2]/app-add-edit-emp/div/div[1]/div[1]/input")).sendKeys(" Gobi ");
//		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[2]/app-add-edit-emp/div/div[1]/div[1]/input")).clear();
//		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[2]/app-add-edit-emp/div/div[1]/div[1]/input")).sendKeys("@#$%%Gobi");
//		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[2]/app-add-edit-emp/div/div[1]/div[1]/input")).clear();
//		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[2]/app-add-edit-emp/div/div[1]/div[1]/input")).sendKeys("WQEQWREWR");
//		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[2]/app-add-edit-emp/div/div[1]/div[1]/input")).clear();
//		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[2]/app-add-edit-emp/div/div[1]/div[1]/input")).sendKeys("osfsdbi");
		//driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[2]/app-add-edit-emp/div/div[1]/div[1]/input")).clear();

	}

}
