package lr6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Task5_Class1 cr = new Task5_Class1();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        cr.setN(scanner.nextInt());


        System.out.println();
        System.out.print("Квадрат натурального числа равен: " + cr.get() + " = " + cr.getK());
    }
}


//5. Напишите программу со статическим методом, которым вычисляется сумма
//        квадратов натуральных чисел 12 + 22 + 32 + ... + n2.
//        Число n передается аргументом методу.
//        Предложите версию метода с рекурсией и без рекурсии.
//        Для проверки результата можно использовать формулу
//        12 + 22 +32+…+n2 = (n+l) (2n + 1)/6