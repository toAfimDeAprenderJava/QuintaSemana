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
		// Em construção
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.id("CTS_TS_LAND_PER_DESCR30$0")).click();
		driver.findElement(By.id("CTS_TS_LAND_PER_DESCR30$1")).click();
		
		driver.switchTo().frame("ptifrmtgtframe");

		// Insira aqui o PID, casoesteja como default, comente a linha abaixo
		//driver.findElement(By.id("PROJECT_CODE$0")).sendKeys("");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Campo Activity
		driver.findElement(By.id("CTS_EX_ACT_VW_DESCR$prompt$img$0")).click();

		driver.findElement(By.id("RESULT0$5")).click();

		/*
		 * WebElement element = driver.findElement(By.id("RESULT0$5"));
		 * 
		 * wait.until(ExpectedConditions.invisibilityOf(element));
		 * 
		 * element.click();
		 */
		// driver.findElement(By.id("RESULT0$5")).click();
		// WebElement element = driver.findElement(By.id("RESULT0$5"));

		// wait.until(ExpectedConditions.invisibilityOf(element));

		// driver.findElement(By.id("RESULT0$5")).click();

		// Insira as horas dos dias aqui
		// \/
		// Domingo
		driver.findElement(By.id("TIME1$0")).sendKeys("");
		// Sábado
		driver.findElement(By.id("TIME2$0")).sendKeys("");
		// Segunda-feira
		driver.findElement(By.id("TIME3$0")).sendKeys("8");
		// Terça-feira
		driver.findElement(By.id("TIME4$0")).sendKeys("8");
		// Quarta-feira
		driver.findElement(By.id("TIME5$0")).sendKeys("8");
		// Quinta-feira
		driver.findElement(By.id("TIME6$0")).sendKeys("8");
		// Sexta-feira
		driver.findElement(By.id("TIME7$0")).sendKeys("8");

		// Submit Timesheet
		driver.findElement(By.id("EX_TIME_HDR_WRK_PB_SUBMIT")).click();
		// Confirm Submit Timesheet

	}
}
