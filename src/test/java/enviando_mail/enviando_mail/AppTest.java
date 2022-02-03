package enviando_mail.enviando_mail;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{
	
	
		
	@Test
	public void testeEmail() throws Exception {
		
		StringBuilder stringBuilderTextoEmail = new StringBuilder();
		
		stringBuilderTextoEmail.append("Bom dia, Fernando.<br/><br/>");
		stringBuilderTextoEmail.append("Você está recebendo o acesso ao Curso de Java Web.<br/><br/>");
		stringBuilderTextoEmail.append("Para ter acesso, clique no botão abaixo.<br/><br/>");
		
		stringBuilderTextoEmail.append("<b>Login:</b> saraivafds@gmail.com<br/><br/>");
		stringBuilderTextoEmail.append("<b>Senha:</b> java-web-show-123<br/><br/>");
		
		stringBuilderTextoEmail.append("<a target=\"_blank\" href=\"https://on.fiap.com.br\" style=\"color:#2525a7; "
				+ "                     padding: 14px 25px; text-align: center; text-decoration: none; display:inline-block; "
				+ "                     border-radius: 30px; font-size: 20px; font-family: courier; "
				+ "                     border: 3px solid green; background-color: #99DA39;\">Acessar área do aluno</a><br/><br/>");
		
		stringBuilderTextoEmail.append("<span style=\"font-size: 8px\">Ass.: Joelson do JDev Treinamentos</span>");
		
		ObjetoEnviaEmail enviaEmail = new ObjetoEnviaEmail("saraivafds@gmail.com", 
															"Fernando Saraiva", 
															"Teste Envia E-mail Java", 
												         	stringBuilderTextoEmail.toString());
		
		enviaEmail.enviarEmail(true);
	}

}    
        

