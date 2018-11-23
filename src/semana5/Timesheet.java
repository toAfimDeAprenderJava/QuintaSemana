package semana5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Timesheet extends Browser {
	
	public void apontarHoras() {
		//Em construção
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		driver.findElement(By.id("CTS_TS_LAND_PER_DESCR30$0")).click();
		//driver.switchTo().frame("TE_TIME_ENTRY");
		//driver.findElement(By.xpath("//div[@id='win0divTIME3$0']//input[@id='TIME3$0']")).sendKeys("444");

		  

	}
}
