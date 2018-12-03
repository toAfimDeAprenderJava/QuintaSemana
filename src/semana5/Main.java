package semana5;

public class Main {

	public static void main( String args[]) {
		
		//Instanciando classe 
		SeleniumWebDrive selenium = new SeleniumWebDrive();
		
		//Executando metodos da classe instanciada
		selenium.setUpDriver();
		
		selenium.Login("...", "...", "..."); // colocar email cog, senha e ID
		
		selenium.TimeSheet("...", "..."); // colocar id e senha
		
	}
	
}
