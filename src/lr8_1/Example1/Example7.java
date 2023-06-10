package lr8_1.Example1;

import java.io.*;
import java.util.Objects;

public class Example7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\Anton\\IdeaProjects\\MyFirstApp\\lab8\\pr7\\MyFile1.txt"), 1024);
            out = new BufferedWriter(new FileWriter("C:\\Users\\Anton\\IdeaProjects\\MyFirstApp\\lab8\\pr7\\MyFile2.txt"));
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!!!");
        }
        finally {
            Objects.requireNonNull(br).close();
            if (out != null) {
                out.flush();
                out.close();
            }
        }
    }
}