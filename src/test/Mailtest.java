package test;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mailtest {
	public static void main(String [] args){  
	      String to = "akannama@cisco.com";//change accordingly  
	      String from = "infocis_communique@external.cisco.com";//change accordingly  
	      //String host = "10.126.136.1";//or IP address  
	   
	      	     //Get the session object  
	      Properties properties = System.getProperties();  
	      //properties.setProperty("mail.smtp.host", host);  
	      
	      //properties.put("mail.smtp.auth", "true");
	      //properties.put("mail.smtp.starttls.enable", "true");
	     //properties.put("mail.smtp.host", "smtp-mail.outlook.com");
	     
	      properties.setProperty("mail.smtp.host", "smtp-mail.outlook.com");
	  //    properties.put("mail.smtp.port", "587");
	      //properties.setProperty("mail.smtp.port", "8080");
	      Session session = Session.getDefaultInstance(properties);  
	  
	     //compose the message  
	      try{  
	         MimeMessage message = new MimeMessage(session);  
	         message.setFrom(new InternetAddress(from));  
	         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
	         message.setSubject("Ping");  
	         message.setText("Hello, this is example of sending email  ");  
	  
	         // Send message  
	         Transport.send(message);  
	         System.out.println("message sent successfully....");  
	  
	      }
	      catch (Exception mex) 
	      {
	    	  System.out.println(mex.getMessage());
	      }
	      
	   
	}
}