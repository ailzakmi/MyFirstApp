package _kurs1.timus.task_1639;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        a = (a * b) % 2;

        System.out.println((a != 0) ? ("[second]=:]") : ("[:=[first]"));
        System.out.flush();
    }
}
