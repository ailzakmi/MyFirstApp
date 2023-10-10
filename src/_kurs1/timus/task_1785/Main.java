package _kurs1.timus.task_1785;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();

        if ((1 <= a) & (a <= 4)) {
            out.println("few");
        } else if ((5 <= a) & (a <= 9)) {
            out.println("several");
        } else if ((10 <= a) & (a <= 19)) {
            out.println("pack");
        } else if ((20 <= a) & (a <= 49)) {
            out.println("lots");
        } else if ((50 <= a) & (a <= 99)) {
            out.println("horde");
        } else if ((100 <= a) & (a <= 249)) {
            out.println("throng");
        } else if ((250 <= a) & (a <= 499)) {
            out.println("swarm");
        } else if ((500 <= a) & (a <= 999)) {
            out.println("zounds");
        } else if ((1000 <= a) & (a <= 2000)) {
            out.println("legion");
        } else if (2000 < a) {
            out.println("neischislimo");
        } else {
            out.println("error");
        }
    }
}
