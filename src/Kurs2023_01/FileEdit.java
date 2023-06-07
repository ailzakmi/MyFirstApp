package Kurs2023_01;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

 /*
    Тут можно реализовать обработку файла.
 */

public class FileEdit extends SSLEmail {
//    private String ntr;
    public boolean toSms() {
        return min(null,null);
    }
    public boolean toSms(String str) {
        return min(str,null);
    }
    public boolean toSms(InputStream in) {
        return min(null,in);
    }
    public boolean toSms(String str, InputStream in) {
        return min(str,in);
    }

    private boolean min(String str, InputStream in) {
        boolean sos = false;
        if ((str != null) & (in != null)) {
            try {
                File fiska = new File("src\\Kurs2023_01\\temp\\"+str);
//                fiska.createNewFile();
                if (fiska.exists()) {
                    System.out.println("Создан!!!!");
                    System.out.println("Полный путь: " + fiska.getAbsolutePath());
                }
                DataOutputStream dOut = new DataOutputStream(new FileOutputStream(fiska));
//                dOut.writeUTF(String.valueOf(in));
                dOut.write(in.readAllBytes());

                getNtr(fiska.getAbsolutePath());
                dOut.flush();
                dOut.close();
                sos = true;
            } catch (Exception e) {
                System.out.println("Ошибка!!! " + e);
            }
        }
        return sos;
    }

//    public String getNTR() {
//        return ntr;
//    }
}
