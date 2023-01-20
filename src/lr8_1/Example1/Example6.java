package lr8_1.Example1;

import java.io.*;

public class Example6 {
    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;
        try {
            in = new FileReader("C:\\Users\\Anton\\IdeaProjects\\MyFirstApp\\lab8\\pr6\\MyFile1.txt");
            out = new FileWriter("C:\\Users\\Anton\\IdeaProjects\\MyFirstApp\\lab8\\pr6\\MyFile2.txt", true);
            int oneByte;
            while ((oneByte = in.read()) != -1) {
                //out.write((char)oneByte);
                out.append((char)oneByte);
                System.out.println((char)oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!!");
        }
        finally {
            in.close();
            out.close();
        }
    }
}