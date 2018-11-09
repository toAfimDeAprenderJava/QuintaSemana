package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExercicioSemana5 {
	@Test
	
	public void testeFazerCadastroLinkedIn(){
        
		//Localizaçao do executável do navegador
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\725999\\drivers\\chromedriver.exe");
        
		//Declarando o objeto do navegador
		WebDriver navegador = new ChromeDriver();
		
		//Maximizando o navegador
        navegador.manage().window().maximize();

        //Abrir a página do LinkedIn
        navegador.get("https://www.linkedin.com");
        
        navegador.findElement(By.id("reg-firstname")).sendKeys("César");
        
        navegador.findElement(By.id("reg-lastname")).sendKeys("Augusto");
        
        navegador.findElement(By.id("reg-email")).sendKeys("teste.teste@teste.com");
        
        navegador.findElement(By.id("reg-password")).sendKeys("123456abc");
        
        navegador.findElement(By.id("registration-submit")).click();

}
}