package lr3;

import java.util.Scanner;

public class Task3_3 {
    public static void main(String[] args) {

        Scanner in = new  Scanner(System.in);
        int a = 1, b = 1;
        System.out.print("Введите колисество чисел в последовательности: ");
        int k = in.nextInt();
        k--;

        System.out.print(a + ", " + b);
        for (int i = 1; i != k; i++) {
            if ((i%2) == 0) {
                b = b + a;
                System.out.print(", " + b);
            } else {
                a = a + b;
                System.out.print(", " + a);
            }
        }
    }
}