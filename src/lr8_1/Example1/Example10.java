package lr8_1.Example1;

import java.io.*;

public class Example10 {
    public static void main(String[] args) {
        BufferedReader br = null;
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
            out.flush();
            out.close();
        }
    }
}