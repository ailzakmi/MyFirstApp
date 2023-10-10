package _kurs1.lr8_1.Example1;

import java.io.*;
import java.util.Objects;

public class Example10 {
    public static void main(String[] args) {
        BufferedReader br;
        PrintWriter out = null;
        try {
            br = new BufferedReader(new InputStreamReader(
                    new FileInputStream("C:\\Users\\Anton\\IdeaProjects\\MyFirstApp\\lab8\\pr10\\MyFile1.txt"), "cp1251"));
            out = new PrintWriter("C:\\Users\\Anton\\IdeaProjects\\MyFirstApp\\lab8\\pr10\\MyFile2.txt", "cp1251");
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        }
        finally {
            //br.close();
            Objects.requireNonNull(out).flush();
            out.close();
        }
    }
}