package com.boldseas.mail;

import com.boldseas.mail.exception.From;
import com.boldseas.mail.exception.SendException;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.Set;

/**
 * Created by bykj on 2015/9/5.
 */
public class SimpleSender implements Sender {
    @Override
    public boolean sendTo(MailMessage email, From from,Set<Recipient> recipients) throws SendException {

        boolean isSendSuccess = false;
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.126.com");
        //props.put("mail.smtp.port", "587");


        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from.getUsername(), from.getPassword());
                    }
                });
//        Session session = Session.getDefaultInstance(props);
        try {
            session.setDebug(true);
            InternetAddress[] addressTo = new InternetAddress[recipients.size()];
            int i = 0;
            for (Recipient recipient : recipients)
            {
                addressTo[i] = new InternetAddress(recipient.getEmailAddress());
                i++;
            }
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from.getEmailAddress()));
            message.setRecipients(Message.RecipientType.TO,addressTo);
            message.setSubject(email.getSubject());
            message.setText(email.getContent());

            Transport.send(message);
            isSendSuccess = true;
        } catch (MessagingException e) {

            throw new RuntimeException(e);
        }
        return isSendSuccess;
    }
}
