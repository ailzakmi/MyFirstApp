package lr8_1.Example1;

import java.io.File;

public class Example1 {
    public static void main(String[] args) {
        try {
            File f1 = new File("lab8\\MyFile1.txt");
            f1.createNewFile();
            if (f1.exists()) {
                System.out.println("Создан!!!!");
                System.out.println("Полный путь1: " + f1.getAbsolutePath());
            }
            File f2 = new File("C:\\Users\\Anton\\IdeaProjects\\MyFirstApp\\lab8\\MyFile2.txt");
            f2.createNewFile();
            System.out.println("Полный путь2: " + f2.getAbsolutePath());
            File f3 = new File("C:\\Users\\Anton\\IdeaProjects\\MyFirstApp\\lab8\\Papka1\\Papka2\\Papka3");
            f3.mkdirs();
            System.out.println("Полный путь3: " + f3.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Ошибка!!! " + e);
        }
    }
}
