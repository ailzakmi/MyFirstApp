package _kurs1.lr6;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        Task7_Class1 cr = new Task7_Class1();
        Random random = new Random();
        int i=0;
        char[] arrINR = new char[0];
        int[] intSim = new int[1];
        String[] baza = new String[10];

        System.out.print("Исходный массив: ");
        do {
            intSim[0] = random.nextInt(200);
            baza[i] = Arrays.toString(intSim);
            System.out.print(intSim[0] + " ");
//            arrINR[i] = baza[i];
            i++;
        } while (i != arrINR.length);
        cr.setk(arrINR.length);



        for (int j=0;j< i;j++) {

            cr.set(arrINR[j],j);
        }

//        cr.setArr();

//        System.out.println();
//        System.out.print("Введите число: ");


        System.out.println();
        System.out.print("Переработанный массив: " + cr.get());
    }
}


//7. Напишите программу со статическим методом, аргументом которому передастся
//        символьный массив, а результатом возвращается ссылка на целочисленным массив,
//        состоящий из кодов символов из массива- аргумента.
