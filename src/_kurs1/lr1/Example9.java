package _kurs1.lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите название месяца: ");
        String mes = in.nextLine();

        System.out.print("Введите колличество дней в месяце: ");
        int number = in.nextInt();

        System.out.println("В "+mes+" "+number+" дней");
        in.close();

    }
}
