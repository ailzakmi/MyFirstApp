package _kurs1.lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int one = in.nextInt();

        System.out.print("Введите второе число: ");
        int two = in.nextInt();

        one = one + two;

        System.out.println("Сумма чисел: "+one);
        in.close();

    }
}
