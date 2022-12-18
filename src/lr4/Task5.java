package lr4;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int l = 5,v = 3;
        Random random = new Random();
        int[][] arr1 = new int[l][v];
        int[][] arr2 = new int[v][l];

        for (int i = 0;i<l;i++) {
            for (int j=0;j<v;j++) {
                arr1[i][j] = random.nextInt(200);
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0;i<v;i++) {
            for (int j=0;j<l;j++) {
                arr2[i][j] = arr1[j][i];
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}


//    Напишите программу, в которой создается двумерный целочисленный
//    массив. Он заполняется случайными числами. Затем в этом массиве строи и
//        столбцы меняются местами: первая строка становится первым столбцом,
//        вторая строка становиться вторым столбцом и так далее. Например, если
//        исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив
//        из 5 строк и 3 столбцов.