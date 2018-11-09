package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExercicioSemana5 {
	@Test
	
	public void fazerLogin(){
        
		//Localizaçao do executável do navegador
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\725999\\drivers\\chromedriver.exe");
        
		//Declarando o objeto do navegador
		WebDriver navegador = new ChromeDriver();
		
		//Maximizando o navegador
        navegador.manage().window().maximize();

        //Abrir a página do Google
        navegador.get("https://www.google.com");

}
}