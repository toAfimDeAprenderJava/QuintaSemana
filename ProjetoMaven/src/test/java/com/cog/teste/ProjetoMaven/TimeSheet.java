package com.cog.teste.ProjetoMaven;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimeSheet {
	
	public WebDriver driver;
	public WebDriverWait wait;
	//abre o time sheet e maximiza a tela
	@Before
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\664586\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://compass.esa.cognizant.com/psc/ESA89PRD/EMPLOYEE/ERP/s/WEBLIB_CTS_FLUD.ISCRIPT1.FieldFormula.ISCRIPT_MainPage");
		wait = new WebDriverWait(driver, 3);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	//dentro do time sheet, seleciona a primeira semana e completa a segunda feira com 58
	public void start() {
		driver.findElement(By.id("CTS_TS_LAND_PER_DESCR30$span$0")).click();
		driver.switchTo().frame("ptifrmtgtframe");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("TIME3$0")).sendKeys("58");
		
	}
	
	@After
	public void email() {
		driver = new ChromeDriver();
		driver.get("https://be.cognizant.com");
		//coloca o email no site
		driver.findElement(By.id("i0116")).sendKeys("danie.freitas@cognizant.com");
		driver.findElement(By.id("i0116")).sendKeys(Keys.ENTER);
		wait = new WebDriverWait(driver, 5);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//procura a searchbox, foi necessário por xpath. não estava achando por ID
		driver.findElement(By.xpath("//*[@id=\"searchbox\"]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("searchbox")).sendKeys("Guilherme Takakuwa");
		wait = new WebDriverWait(driver, 5);
		driver.findElement(By.xpath("//*[@id=\"searchbox-results-container-1\"]/div[2]/div[4]/div[1]/a[1]")).click();;
		
		//mandar email pro gui
		driver.findElement(By.xpath("//*[@id=\"spa-view\"]/section/div/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();		
	}
	
}
