package _kurs1.lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input name: ");
        String name = in.next();

        System.out.println("Input age: ");
        int age = in.nextInt();

        System.out.println("Name and age: " + name + " " + age);
        in.close();

    }
}
