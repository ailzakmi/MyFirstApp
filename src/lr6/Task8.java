package lr6;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        Task8_Class1 cr = new Task8_Class1();
        Random random = new Random();
        int i=0;
        int[] arrINR = new int[100];

        System.out.println();
        do {
            arrINR[i] = random.nextInt(200);
            i++;
        } while (i != 10);
        cr.setk(i);

        for (int j=0;j< i;j++) {
            cr.set(arrINR[j],j);
        }

        System.out.println();
        System.out.println("Среднее значение массива: " + cr.getSr());

    }
}


//8. Напишите программу со статическим методом, аргументом которому передается
//        целочисленный массив, а результатом возвращается среднее значение для элементов
//        массива (сумма значений элементов, деленная на количество элементов в массиве).