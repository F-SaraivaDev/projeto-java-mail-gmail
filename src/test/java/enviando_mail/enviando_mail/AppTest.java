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
	
	private String userName = "testejavamailjavaweb@gmail.com";
	private String senha = "skyneT91";
		
	@Test
	public void testeEmail() {
		
		try {
			Properties properties = new Properties();
			properties.put("mail.smtp.auth", "true");
			properties.put("mail.smtp.starttls", "true");
			properties.put("mail.smtp.host", "smtp.gmail.com");
			properties.put("mail.smtp.port", 465);
			properties.put("mail.smtp.socketFactory.port", "465");
			properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			
			Session session = Session.getInstance(properties, new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					// TODO Auto-generated method stub
					return new PasswordAuthentication(userName, senha);
				}
			});
			
			Address[] toUser = InternetAddress.parse("testejavamailjavaweb@gmail.com,"
			                       +"saraivafds@gmail.com, fersaraiva2018@gmail.com" );
			
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(userName));
			message.setRecipients(Message.RecipientType.TO, toUser);
			message.setSubject("Chegou o e-mail enviado com Java");
			message.setText("Olá programador, vc acaba de receber um e-mail enviado com java"
			              + "do curso JDEV desenvolvimento");
			
			Transport.send(message);
			
		} catch (Exception e) {
            e.printStackTrace();
		}
		
		
		
	}

}    
        

