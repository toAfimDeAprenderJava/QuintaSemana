package semana5;


import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

//import org.junit.jupiter.api.Test;

/**
*   Escreva 10 metodos do Selenium que façam ações na pagina web da Cognizant
 *  Entre esses métodos tenha pelo menos um método para
 *  -Procurar um elemento por id
 *  -Clicar em um elemento da pagina html
 *  -Usar um elemento WebDriver
 *  -Escrever em um campo de texto
 *
 *  Com esses metodos que você criou, tente abrir a sua timesheet
 */
public class SeleniumWebDrive extends Timesheet{

	LocalDate actualDate = LocalDate.now();
	
	@Before
	public void tearUp() {
		getChrome("https://compass.esa.cognizant.com/psc/ESA89PRD/EMPLOYEE/ERP/c/ADMINISTER_EXPENSE_FUNCTIONS.CTS_TS_LAND_COMP.GBL?Action=A&local_date="+actualDate);
		
}
	@Test
	public void submitTimesheet() {
		login();
		apontarHoras();
		
		//assertTrue("erro ao verificar timesheet", returnBoolean("Timesheet Summary"));
	}
/*	@Test
	public void assertTimesheet() {
		//assertEquals("Timesheet Summary", returnAssert());
		
	}*/
}