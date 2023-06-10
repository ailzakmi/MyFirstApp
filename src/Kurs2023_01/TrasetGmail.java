package Kurs2023_01;

import jakarta.activation.DataHandler;
import jakarta.activation.FileDataSource;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

import java.util.Properties;

public class TrasetGmail {
    public static void main(String[] args) {
        String tema = "",text = "",filePut = "";
        TrasetGmail zfc = new TrasetGmail();
        zfc.traset(tema,text,filePut);
    }
    public void traset(String tema,String text,String filePut) {
        final String fromEmail = "javaxmising@gmail.com"; //requires valid gmail id
//        final String password = "VsegdaBiTak1"; // correct password for gmail id
        //TochnoNeVzlomaut!!!
        final String password = "vuqrhqonibovtarq"; // correct password for gmail id
        final String toEmailOut = "anton_2000_19@mail.ru"; // can be any email id
//        String file;

        // Необходимые настройки для отправки
        Properties propsOut = new Properties();
        propsOut.put("mail.smtp.host", "smtp.gmail.com");
        propsOut.put("mail.smtp.port", "587");
        propsOut.put("mail.smtp.auth", "true");
        propsOut.put("mail.smtp.ssl.protocols", "TLSv1.2");
        propsOut.put("mail.smtp.starttls.enable", "true");

        // Аутенфикация
        Authenticator authOut = new Authenticator() {
            //override the getPasswordAuthentication method
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        };
        Session sessionOut = Session.getInstance(propsOut, authOut);
        System.out.println("TLSEmail STT  " + sessionOut);

        try {
            MimeMessage message = new MimeMessage(sessionOut); // email message
            message.setFrom(new InternetAddress(fromEmail)); // setting header fields
            message.setRecipients(Message.RecipientType.TO, String.valueOf(new InternetAddress(toEmailOut)));

            //Тема письма
            if (tema.equals("")) {
                message.setSubject("Проверенный фаил.");
            } else {
                message.setSubject(tema);
            }
            MimeBodyPart mesBodyPart = new MimeBodyPart();
            Multipart multipart = new MimeMultipart();

            // Путь до файла
            if (filePut.equals("")) {
                filePut = "C:\\Users\\Anton\\IdeaProjects\\MyFirstApp\\src\\Kurs2023_01\\temp\\МР ГОСТ 7.32-2017_.docx";
            }
            System.out.println(filePut);

            // Извлечение имени файла из пути до файла
            int all,alk = 0;
            String fileName = "";
            char[] fileArr = filePut.toCharArray();
            for (int i = 0;i<filePut.length();i++) {
                if (fileArr[i] == '\\') {
                    alk = i;
                }
            }
            for (all=alk+1;all<filePut.length();all++) {
                fileName = fileName + fileArr[all];
            }
            System.out.println(fileName);

            // Запаковка сообщения
            FileDataSource source = new FileDataSource(filePut);    // Достаём файл
            mesBodyPart.setDataHandler(new DataHandler(source)); // Ложим файл в Body
            mesBodyPart.setFileName(fileName);  // Даём файлу имя
            multipart.addBodyPart(mesBodyPart); // Покуем Body
            message.setContent(multipart);      // Добавляем вложение к сообщению
//            message.setText(text);              // Добавляем текст к сообщению

            System.out.println("Vrode vse");
            Transport.send(message); //Отправка сообения
            System.out.println("Письмо отправлено.");
        } catch (MessagingException e){
            e.printStackTrace();
        }
    }

}