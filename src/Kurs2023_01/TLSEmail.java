package Kurs2023_01;

import java.io.*;
import java.util.Properties;

import jakarta.mail.*;
import jakarta.mail.Message;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeUtility;

public class TLSEmail {

    /**
     Outgoing Mail (SMTP) Server
     requires TLS or SSL: smtp.gmail.com (use authentication)
     Use Authentication: Yes
     Port for TLS/STARTTLS: 587
     */
    public static void main(String[] args) {
        final String fromEmail = "ZhduSoobshcheniya@yandex.ru"; //requires valid gmail id
        final String password = "cygnafdizgtoectb"; // correct password for gmail id
        final String toEmail = "anton_2000_19@mail.ru"; // can be any email id

        System.out.println("TLSEmail Start");
//        Properties props = new Properties();
//        props.put("mail.smtp.host", "smtp.yandex.ru"); //SMTP Host
//        props.put("mail.smtp.port", "465"); //TLS Port
//        props.put("mail.smtp.ssl.enable", "true"); //enable SSL
//        props.put("mail.smtp.auth", "true"); //enable authentication
//        props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
        Properties props = new Properties();
        props.put("mail.store.protocol", "pop3");
        props.put("mail.pop3.host", "pop.yandex.ru");
        props.put("mail.pop3.port", "995");
//        props.put("mail.pop3.starttls.enable", "true");
//        props.put("mail.pop3.ssl.enable", "true"); //enable SSL
        props.put("mail.pop3.socketFactory.class", "jakarta.net.ssl.SSLSocketFactory"); //SSL Factory Class

        //create Authenticator object to pass in Session.getInstance argument
        Authenticator auth = new Authenticator() {
            //override the getPasswordAuthentication method
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        };
        Session session = Session.getInstance(props, auth);
        System.out.println("TLSEmail STT  " + session);

        try {
            Store store = session.getStore("pop3s");
            store.connect("pop.yandex.ru", "ZhduSoobshcheniya@yandex.ru", "cygnafdizgtoectb");

            Folder emailFolder = store.getFolder("INBOX");
            emailFolder.open(Folder.READ_ONLY);

            Message[] messages = emailFolder.getMessages();
            System.out.println("Total Message " + messages.length);


//            // get the INBOX folder
//            Folder inbox = store.getFolder("INBOX");
//
//            // open the INBOX folder
//            inbox.open(Folder.READ_WRITE);

            Message m = emailFolder.getMessage(1); // get Message # 1
            MimeMessage mimeMes = (MimeMessage) m;
            System.out.println("1 пар:  " + m);
            String subject = m.getSubject(); // get Subject
            System.out.println("2 пар:  " + subject);
            Object content = m.getContent(); // get content
            System.out.println("3 пар:  " + content);
//            FileInputStream fis = new FileInputStream(String.valueOf(emailFolder));
//            InputStream fis = new LineInputStream(emailFolder.getMessage(1).getInputStream());
//            MimeMessage mimeMessage = new MimeMessage(session, fis);

            System.out.println();
            for (Message message: messages) {
//                Address[] toAddress = message.getRecipients(Message.RecipientType.TO);
                System.out.println("Subject: " + message.getSubject());
                System.out.println("From: " + message.getFrom()[0]);
//                System.out.println("Address: " + Arrays.toString(toAddress));
            }
            System.out.println();

            for(Address recipient : mimeMes.getRecipients(Message.RecipientType.TO)){
                System.out.println(recipient.toString());
            }
            for(Address sender : mimeMes.getFrom()){
                System.out.println(sender.toString());
            }

            System.out.println();
            // Если контент письма состоит из нескольких частей
            if(mimeMes.isMimeType("multipart/mixed")){
                // getContent() возвращает содержимое тела письма, либо его части.
                // Возвращаемый тип - Object, делаем каст в Multipart
                Multipart multipart = (Multipart) mimeMes.getContent();
                // Перебираем все части составного тела письма
                for(int i = 0; i < multipart.getCount(); i ++){
                    BodyPart part = multipart.getBodyPart(i);
                    //Для html-сообщений создается две части, "text/plain" и "text/html" (для клиентов без возможности чтения html сообщений), так что если нам не важна разметка:
                    if(part.isMimeType("text/plain")){
                        System.out.println(part.getContent().toString());
                    }
                    // Проверяем является ли part вложением
                    else if (Part.ATTACHMENT.equalsIgnoreCase(part.getDisposition())) {
                        // Опускаю проверку на совпадение имен. Имя может быть закодировано, используем decode
                        String fileName = MimeUtility.decodeText(part.getFileName());
                        System.out.println(fileName);
                        // Получаем InputStream
                        InputStream is = part.getInputStream();
                        // Далее можем записать файл, или что-угодно от нас требуется

                    }

                }
            }
// Сообщение состоит только из одного блока с текстом сообщения
            else if(mimeMes.isMimeType("text/plain")){
                System.out.println(mimeMes.getContent().toString());
            }
//            else {
//                Object content3 = m.getContent(); // get content
//                System.out.println("33 пар:  " + content3);
//            }

//            inbox.close(); // Close the INBOX
            store.close(); // Close the Store
        } catch (MessagingException | IOException e) {
            throw new RuntimeException(e);
        }


//        Session session = Session.getInstance(props, auth);
//        System.out.println("TLSEmail STT  " + session);
//        try {
//            FileInputStream fis = new FileInputStream("https://mail.yandex.ru/?uid=1828010344#message/182958734861926401");
//            MimeMessage mimeMessage = new MimeMessage(session, fis);
//
//            String messageSubject = mimeMessage.getSubject();
//            String messageId = mimeMessage.getMessageID();
//
//            for(Address recipient : mimeMessage.getRecipients(Message.RecipientType.TO)){
//                System.out.println(recipient.toString());
//            }
//        } catch (MessagingException | FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

//        try {
//            Store store = session.getStore();
//            store.connect();
//
//            // get the INBOX folder
//            Folder inbox = store.getFolder("INBOX");
//
//            // open the INBOX folder
//            inbox.open(Folder.READ_WRITE);
//
//            Message m = inbox.getMessage(1); // get Message # 1
//            System.out.println(m);
//            String subject = m.getSubject(); // get Subject
//            System.out.println(subject);
//            Object content = m.getContent(); // get content
//            System.out.println(content);
//            //EmailUtil.sendEmail(session, toEmail,"TLSEmail Testing Subject", "TLSEmail Testing Body");
//
//            inbox.close(); // Close the INBOX
//            store.close(); // Close the Store
//        } catch (MessagingException | IOException e) {
//            throw new RuntimeException(e);
//        }


    }


}
