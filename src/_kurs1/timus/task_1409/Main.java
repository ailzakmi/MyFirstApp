package _kurs1.timus.task_1409;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int numberBanki = a + b - 1;

        int garry = numberBanki - a;
        int larry = numberBanki - b;

        out.println(garry + " " + larry);
        out.flush();
    }
}
