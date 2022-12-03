package lr2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите переменную: ");

        int x = in.nextInt();

        int result = x % 5; //2
        int result2 = x % 7; //1

        if ((result == 2) & (result2 == 1)) {
            System.out.println("Переменная удовлетворяет требованиям");
        } else {
            System.out.println("Переменная не удовлетворяет требованиям");
        }

    }
}
