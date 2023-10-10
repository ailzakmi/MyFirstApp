package _kurs1.lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите год рождения: ");
        int god = in.nextInt();

        god = 2022 - god;

        System.out.println("Вам "+god);
        in.close();

    }
}
