package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите название дня недели: ");
        String name = in.nextLine();

        System.out.print("Введите название месяца: ");
        String mes = in.nextLine();

        System.out.print("Введите номер дня в месяце: ");
        int number = in.nextInt();

        System.out.println("Сегодня: "+name+" "+number+" "+mes);
        in.close();

    }
}
