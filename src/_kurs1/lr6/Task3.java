package _kurs1.lr6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Task3_Class1 cr = new Task3_Class1();
//        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int i=0;
        int[] arrINR = new int[100];
//        System.out.print("Введите число: ");
//        do {
//            arrINR[i] = scanner.nextInt();
//            if (arrINR[i] == 000) break;
//            i++;
//        } while (true);
        System.out.println();
        do {
            arrINR[i] = random.nextInt(200);
            i++;
        } while (i != 10);
        cr.setk(i);
//        System.out.print("Изначальный массив: ");
        for (int j=0;j< i;j++) {
//            System.out.print(arrINR[j] + " ");
            cr.set(arrINR[j],j);
        }

        System.out.println();
        System.out.println(cr.getAll());

        System.out.print(cr.get());

    }
}


//3. Напишите программу с классом, в котором есть статические методы, которым
//        можно передавать произвольное количество целочисленных аргументов (или
//        целочисленный массив). Методы, на основании переданных аргументов или массива,
//        позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
//        значение из набора чисел.
