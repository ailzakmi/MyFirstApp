package Kurs2023_01.Neud;

import jakarta.mail.*;
import jakarta.mail.internet.MimeMessage;

import java.net.InetAddress;
import java.util.Date;
import java.util.Properties;

public class Vsak {

    public static void main(String[] args) {
        final String fromEmail = "ZhduSoobshcheniya@yandex.ru"; //requires valid gmail id
        final String password = "Niktonevzlomaetdo30"; // correct password for gmail id
        final String toEmail = "myemail@yahoo.com"; // can be any email id
//        Properties props = new Properties();
//        props.put("smtp.yandex.ru", "ZhduSoobshcheniya@yandex.ru");

        System.out.println("TLSEmail Start");
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.yandex.ru"); //SMTP Host
        props.put("mail.smtp.port", "465"); //TLS Port
        props.put("mail.smtp.auth", "true"); //enable authentication
        props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
        Authenticator auth = new Authenticator() {
            //override the getPasswordAuthentication method
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        };
        Session session = Session.getInstance(props, auth);

        try {
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom("koe_kak.86@mail.ru");
            msg.setRecipients(Message.RecipientType.TO,
                    "anton_2000_19@mail.ru");
            msg.setSubject("JavaMail hello world example");
            msg.setSentDate(new Date());
            msg.setText("Hello, world!\n");
            Transport.send(msg, "koe_kak.86@mail.ru", "Nfyrb_yf_ghjrfxre2020KV");
        } catch (MessagingException mex) {
            System.out.println("send failed, exception: " + mex);
        }
    }

    private static final Authenticator authenticator = new Authenticator() {

        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
            //return new PasswordAuthentication(
            //        this.getDefaultUserName(),
            //        PropUtils.getPassword()
            //);
            return new PasswordAuthentication(
                    "koe_kak.86@mail.ru",
                    "Nfyrb_yf_ghjrfxre2020KV"
            );



        }
        //PasswordAuthentication PropUtils;
    };
}

//        mail.transport.protocol = smtps
//        mail.smtp.host = smtp.yandex.ru
//        mail.smtp.port = 465
//        mail.smtp.user = artem.boiar
//        mail.smtp.ssl.enable = true
//        mail.smtp.auth = true
//        mail.debug = true