package lr2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите переменную: ");

        int x = in.nextInt();

        if ((x >= 5) & (x <= 10)) {
            System.out.println("Переменная удовлетворяет требованиям");
        } else {
            System.out.println("Переменная не удовлетворяет требованиям");
        }

    }
}
