package Kurs2023_01;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

 /*
    Тут можно реализовать обработку файла.
 */

public class FileEdit{
    private String filePut = "";
    public void toSms (String fileName, InputStream inputStream) {
        min(fileName,inputStream);
    }
    public String getFilePut(){
        return filePut;
    }
    private void min(String fileName, InputStream inputStream) {
        if ((fileName != null) & (inputStream != null)) {
            try {
                File fiska = new File("src\\Kurs2023_01\\temp\\"+fileName);

                if (fiska.exists()) {
                    System.out.println("Создан!!!!");
                    System.out.println("Полный путь: " + fiska.getAbsolutePath());
                }
                DataOutputStream dOut = new DataOutputStream(new FileOutputStream(fiska));
                dOut.write(inputStream.readAllBytes());

                filePut = fiska.getAbsolutePath();

                dOut.flush();
                dOut.close();
                System.out.println("Сохранен");
            } catch (Exception e) {
                System.out.println("Не сохранен");
                System.out.println("Ошибка!!! " + e);
            }
        } else {
            System.out.println("Не сохранен");
        }
    }
}
