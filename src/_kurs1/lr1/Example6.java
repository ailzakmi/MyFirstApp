package _kurs1.lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input family: ");
        String family = in.next();

        System.out.println("Input name: ");
        String name = in.next();

        System.out.println("Input patronymic: ");
        String patronymic = in.next();

        System.out.println("Hello: "+family+" "+name+" "+patronymic);
        in.close();

    }
}
