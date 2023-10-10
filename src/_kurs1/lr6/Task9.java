package _kurs1.lr6;

import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        Task9_Class1 cr = new Task9_Class1();
        Random random = new Random();
        int i=0,p=10;
        int[] arrINR = new int[p];

        System.out.print("Исходный массив: ");

        do {
            arrINR[i] = random.nextInt(200);
            System.out.print(arrINR[i] + " ");
            i++;
        } while (i != p);
        cr.setk(i);

        for (int j=0;j< i;j++) {
            cr.set(arrINR[j],j);
        }
        cr.Rasp();

        System.out.println();
        System.out.print("Конечный массив: ");
        System.out.print(cr.get());

    }
}

//
//9. Напишите программу со статическим методом, аргументом которому передается
//        одномерный символьный массив. В результате вызова метода элементы массива попарно
//        меняются местами: первый — с последн и м , второй — с предпоследним и так далее.