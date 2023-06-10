package timus.task_1787;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int left = 0;

        for (int i = 0;i<b;i++) {
            int x = in.nextInt();
            left = left + x - a;
            if (left<0) {
                left = 0;
            }
        }

        System.out.println(left);
    }
}
