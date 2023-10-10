package _kurs1.lr2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите переменную: ");

        int x = in.nextInt();

        x %= 3;

        if (x == 0) {
            System.out.println("Переменная делится на 3");
        } else {
            System.out.println("Переменная не делится на 3");
        }

    }
}
