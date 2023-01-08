package lr6;

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        Task10_Class1 cr = new Task10_Class1();
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

        System.out.println();
        System.out.println(cr.getAll());
    }
}


//10. Напишите программу со статическим методом, аргументом которому передается
//        произвольное количество целочисленных аргументов. Результатом метод возвращает
//        массив из двух элементов: это значения наибольшего и наименьшего значений среди
//        аргументов, переданных методу.