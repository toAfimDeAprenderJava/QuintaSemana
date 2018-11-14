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
        
        //Preencher o campo do primeiro nome
        navegador.findElement(By.id("reg-firstname")).sendKeys("César");
        
        //Preencher o campo do sobrenome
        navegador.findElement(By.id("reg-lastname")).sendKeys("Augusto");
        
        //Preencher o campo de email
        navegador.findElement(By.id("reg-email")).sendKeys("teste.teste@teste.com");
        
        //Preencher o campo de senha
        navegador.findElement(By.id("reg-password")).sendKeys("123456abc");
        
        //Clicar no botão de cadastrar
        navegador.findElement(By.id("registration-submit")).click();

}
}