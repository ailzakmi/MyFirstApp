package Kurs2023_01;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class TrasetEmail {
    public static void main(String[] args) {
        TrasetEmail zfc = new TrasetEmail();
        zfc.traset();
    }
    public void traset() {
        final String fromEmail = "ZhduSoobshcheniya@yandex.ru"; //requires valid gmail id
        final String password = "cygnafdizgtoectb"; // correct password for gmail id
        final String toEmailOut = "anton_2000_19@mail.ru"; // can be any email id
//        FileEdit file = new FileEdit();
//        String vss = file.getNTR();
//        sendAttachmentEmail(session, toEmail, subject, vss);


        Properties propsOut = new Properties();
        propsOut.put("mail.store.protocol", "smtp");
        propsOut.put("mail.smtp.host", "smtp.yandex.ru");
        propsOut.put("mail.smtp.port", "465");
//        propsOut.put("mail.protocol.port", "465");
        propsOut.put("mail.smtp.socketFactory.class", "jakarta.net.ssl.SSLSocketFactory"); //SSL Factory Class

        Authenticator authOut = new Authenticator() {
            //override the getPasswordAuthentication method
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        };
        Session sessionOut = Session.getInstance(propsOut, authOut);
        System.out.println("TLSEmail STT  " + sessionOut);

//        sendAttachmentEmail(sessionOut, toEmailOut, subject, vss);
        try {
            Store storeOut = sessionOut.getStore("smtp");
            System.out.println("Tut, da?");
            storeOut.connect("smtp.yandex.ru", 465, "ZhduSoobshcheniya", "cygnafdizgtoectb");
            System.out.println("Ne. Tut.");

            MimeMessage message = new MimeMessage(sessionOut); // email message

            message.setFrom(new InternetAddress(toEmailOut)); // setting header fields

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(fromEmail));

            message.setSubject("Test Mail from Java Program"); // subject line

            // actual mail body
            message.setText("You can send mail from Java program by using mail API, but you need" +
                    "couple of more JAR files e.g. smtp.jar and activation.jar");

            // Send message
            System.out.println("Vrode vse");
            Transport.send(message, fromEmail, password);
            System.out.println("Email Sent successfully....");
        } catch (MessagingException e){ e.printStackTrace(); }
    }

}

//TochnoNeVzlomaut!!!