package lr1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int god = in.nextInt();

        god = 2022 - god;

        System.out.println("Ваш год рождения: "+god);
        in.close();

    }
}
