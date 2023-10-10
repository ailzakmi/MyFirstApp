package _kurs1.lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int one = in.nextInt();

        int two = one - 1;
        int thee = one + 1;
        System.out.println("Первое число: "+two);
        System.out.println("Второе число: "+one);
        System.out.println("Третье число: "+thee);

        thee = one+two+thee;
        thee = thee*thee;

        System.out.println("Четвертое число: "+thee);
        in.close();

    }
}
