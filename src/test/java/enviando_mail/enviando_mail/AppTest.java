package enviando_mail.enviando_mail;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{
	
	
		
	@Test
	public void testeEmail() throws Exception {
		
		ObjetoEnviaEmail enviaEmail = new ObjetoEnviaEmail("saraivafds@gmail.com", 
				"Fernando Saraiva", 
				"Teste Envia E-mail Java", 
				"Treinamento envia e-mail com java");
		
		enviaEmail.enviarEmail();
	}

}    
        

