package Kurs2023_01.Neud;

import jakarta.mail.Authenticator;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.internet.MimeMessage;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.InetAddress;
import java.util.Properties;

public class ParserMail {
    //private static Properties mailProperties;
    private static final Authenticator authenticator = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(
                    "koe_kak.86@mail.ru",
                    "Nfyrb_yf_ghjrfxre2020KV"
                );
            }
//            @Override
//            protected final Authenticator getRequestingSite("https://mail.yandex.ru/?uid=1828010344#message/182958734861926401");
            //PasswordAuthentication PropUtils;
    };
    public static void main(String[] args) {
        Properties pro = new Properties();
        Session session = Session.getInstance(pro, authenticator);

//        Session session = Session.getDefaultInstance(System.getProperties());
        //String pathToMessage = "0";
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("https://mail.yandex.ru/?uid=1828010344#message/182958734861926401");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            MimeMessage mimeMessage = new MimeMessage(session, fis);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}

    // в примере properties оставляю дефолтными
    //Session session = Session.getDefaultInstance(System.getProperties());
    //FileInputStream fis = new FileInputStream(pathToMessage);
    //MimeMessage mimeMessage = new MimeMessage(session, fis);