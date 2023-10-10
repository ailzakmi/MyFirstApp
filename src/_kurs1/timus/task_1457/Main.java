package _kurs1.timus.task_1457;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 0;
        double n = in.nextLong();

        for (int i = 0; i < n; i++) {
            a = a + in.nextLong();
        }
        double k = a / n;
        System.out.print((k));
    }
}