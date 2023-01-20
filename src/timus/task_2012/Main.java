package timus.task_2012;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        a = 12 - a;
        a = a * 45;

        if (a <= 240) {
            out.println("YES");
        } else {
            out.println("NO");
        }

        out.flush();
    }
}
