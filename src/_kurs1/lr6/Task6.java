package _kurs1.lr6;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Task6_Class1 cr = new Task6_Class1();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int i=0;
        int[] arrINR = new int[10];

        do {
            arrINR[i] = random.nextInt(200);
            i++;
        } while (i != arrINR.length);
        cr.setk(arrINR.length);

        System.out.print("Исходный массив: ");

        for (int j=0;j< i;j++) {
            System.out.print(arrINR[j] + " ");
            cr.set(arrINR[j],j);
        }

        System.out.println();
        System.out.print("Введите число: ");
        cr.setN(scanner.nextInt());

        System.out.println();
        System.out.print("Переработанный массив: " + cr.get());
    }
}


//6. Напишите программу со статическим методом, которому аргументом передается
//        целочисленный массив и целое число. Результатом метод возвращает ссылку на новый
//        массив, который получается из исходного массива (переданного первым аргументом
//        методу), если в нем взять несколько начальных элементов. Количество элементов, которые
//        нужно взять из исходного массива, определяются вторым аргументом метода. Если второй
//        аргумент метода больше длины массива, переданного первым аргументом, то методом
//        создается копия исходного массива и возвращается ссылка на эту копию.
