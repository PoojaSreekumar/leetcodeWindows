package com.send.SendEmailTo;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Properties prop = new Properties();
		prop.put("mail.smtp.auth", true);
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587");
		prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");

		Session session = Session.getInstance(prop, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("switchs2017@gmail.com", "Asdasd1!");
			}
		});
		// Session session=Session.getDefaultInstance(prop, null);
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("switchs2017@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("chocolate65733@gmail.com"));
			message.setSubject("Mail Subject Java");

			String msg = "This is my first email using JavaMailer";

			MimeBodyPart mimeBodyPart = new MimeBodyPart();
			mimeBodyPart.setContent(msg, "text/html");

			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(mimeBodyPart);

			message.setContent(multipart);

			Transport.send(message);
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
    }
}
