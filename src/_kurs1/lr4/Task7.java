package _kurs1.lr4;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int l,u,p = 5;
        Random random = new Random();
        int[][] arr1 = new int[p][p];

        l = arr1.length - 1;
        u = arr1.length;
        for (int i = 0;i < p;i++) {
//          int k = 0,y = 0;
            for (int j = 0;j < u;j++) {
//                k++;
//                arr1[i][j] = k;
//                arr1[l-j][h-i] = k+100;
                arr1[i][j] = random.nextInt(200);
//                arr1[l-j][h-i] = random.nextInt(200);
//                System.out.print("1: " + arr1[i][j] + " ");
//                System.out.print("2: " + arr1[l-j][h-i] + " ");
            }
            u--;


            for (int j = 4;j > i;j--) {
//                y++;
//                arr1[j][l] = y+10;
                arr1[j][l] = random.nextInt(200);
//                System.out.print(arr1[i][j] + " ");
            }
            l--;
        }

        for (int i = 0;i< p;i++) {
            for (int j=0;j< p;j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}


//    Напишите программу, в которой создается двумерный числовой массив
//        и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
//        затем последний столбец (снизу вверх), вторая строка (слева направо) и так
//        далее.




// Я сломался.