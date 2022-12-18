package lr4;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int l,v,m = 0;
        Random random = new Random();
        int[][] arr1 = new int[5][5];
        int[][] arr2 = new int[arr1.length][arr1.length];

        for (int i = 0;i< arr1.length;i++) {
            for (int j=0;j< arr1.length;j++) {
                arr1[i][j] = random.nextInt(200);
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        l = random.nextInt(arr1.length);
        v = random.nextInt(arr1.length);

        for (int i = 0;i< arr1.length;i++) {
            for (int j=0;j< arr1.length;j++) {
                if ((i == l) || (j == v)) {
                    m = m +1;
                } else {
                    arr2[i][j] = arr1[i][j];
                    System.out.print(arr2[i][j] + " ");
                }
            }
            if (i != l) System.out.println();
        }
    }
}


//    Напишите программу, в которой создается и инициализируется
//    двумерный числовой массив. Затем из этого массива удаляется строка и
//    столбец (создается новый массив, в котором по сравнению с исходным
//    удалена одна строка и один столбец). Индекс удаляемой строки и индекс
//    удаляемого столбца определяется с помощью генератора случайных чисел.