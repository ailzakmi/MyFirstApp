package Kurs2023_01;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

import jakarta.mail.*;
import jakarta.mail.Message;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeUtility;

public class SSLEmail {
    public static void main(String[] args) {
        FileEdit file = new FileEdit();
        TrasetGmail trasetGmail = new TrasetGmail();
        String tema = "",text = "",filePut = "";
        final String fromEmail = "javaxmising@gmail.com"; //requires valid gmail id
        final String password = "vuqrhqonibovtarq"; // correct password for gmail id
        final String toEmail = "anton_2000_19@mail.ru"; // can be any email id

        System.out.println("TLSEmail Start");
//        Properties props = new Properties();
//        props.put("mail.smtp.host", "smtp.yandex.ru"); //SMTP Host
//        props.put("mail.smtp.port", "465"); //TLS Port
//        props.put("mail.smtp.ssl.enable", "true"); //enable SSL
//        props.put("mail.smtp.auth", "true"); //enable authentication
//        props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
//        Properties props = new Properties();
//        props.put("mail.store.protocol", "pop3");
//        props.put("mail.pop3.host", "pop.yandex.ru");
//        props.put("mail.pop3.port", "995");
//        props.put("mail.pop3.starttls.enable", "true");
//        props.put("mail.pop3.ssl.enable", "true"); //enable SSL
//        props.put("mail.pop3.socketFactory.class", "jakarta.net.ssl.SSLSocketFactory"); //SSL Factory Class

        Properties props = new Properties();
        props.put("mail.pop3.host", "pop.gmail.com");
        props.put("mail.pop3.port", "995");
        props.put("mail.pop3.auth", "true");
        props.put("mail.pop3.ssl.protocols", "TLSv1.2");
        props.put("mail.pop3.starttls.enable", "true");

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
            store.connect("pop.gmail.com", fromEmail, password);

            Folder emailFolder = store.getFolder("INBOX");
            emailFolder.open(Folder.READ_ONLY);
//            open the INBOX folder
//            inbox.open(Folder.READ_WRITE);

            Message[] messages = emailFolder.getMessages();
            System.out.println("Total Message " + messages.length);

            for (Message message: messages) {
//                Address[] toAddress = message.getRecipients(Message.RecipientType.TO);
                System.out.println("Сообщение № " + message.getMessageNumber());
                System.out.println("    Тема: " + message.getSubject());
                System.out.println("    От кого: " + message.getFrom()[0]);
//                System.out.println("Address: " + Arrays.toString(toAddress));
            }

            Scanner in = new Scanner(System.in);
            System.out.print("Введите номер необходимого сообщения: ");
            int k = in.nextInt();


            Message m = emailFolder.getMessage(k); // get Message #k
            MimeMessage mimeMes = (MimeMessage) m;
//            System.out.println("1 пар:  " + m);
//            String subject = m.getSubject(); // get Subject
//            System.out.println("2 пар:  " + subject);
//            Object content = m.getContent(); // get content
//            System.out.println("3 пар:  " + content);
            System.out.println();

            System.out.println("Сообщение № " + k);
            for(Address recipient : mimeMes.getRecipients(Message.RecipientType.TO)){
                System.out.println("    " + recipient.toString());
            }
            for(Address sender : mimeMes.getFrom()){
                System.out.println("    " + sender.toString());
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
                        System.out.println(part.getContent().toString()+"33 kota");
                    }
                    // Проверяем является ли part вложением
                    else if (Part.ATTACHMENT.equalsIgnoreCase(part.getDisposition())) {
                        // Опускаю проверку на совпадение имен. Имя может быть закодировано, используем decode
                        String fileName = MimeUtility.decodeText(part.getFileName());
                        System.out.println(fileName);
                        // Получаем InputStream
                        InputStream is = part.getInputStream();
                        // Далее можем записать файл, или что-угодно от нас требуется

                        file.toSms(fileName, is);       // Сохраняем файл
                        filePut = file.getFilePut();
                        store.close();
                        trasetGmail.traset(tema,text,filePut);  // Отправляем файл
                    }

                }
            }
// Сообщение состоит только из одного блока с текстом сообщения
            else if(mimeMes.isMimeType("text/plain")){
                System.out.println(mimeMes.getContent().toString());
            }

//            inbox.close(); // Close the INBOX
            store.close(); // Close the Store
        } catch (MessagingException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
