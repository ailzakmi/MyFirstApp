package _kurs1.lr2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите переменную: ");

        int x = in.nextInt();

        int result = x % 4; //0

        if ((result == 0) & (x < 10)) {
            System.out.println("Переменная удовлетворяет требованиям");
        } else {
            System.out.println("Переменная не удовлетворяет требованиям");
        }

    }
}
