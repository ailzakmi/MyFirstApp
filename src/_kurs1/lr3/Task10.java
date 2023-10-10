package _kurs1.lr3;

import java.util.Arrays;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {

        Random random = new Random();
        int size = 10;
        int[] nums = new int[size];

        System.out.print("Изначальный массив: ");
        for (int i = 0 ; i < size ; i++ ){
            nums[i] = random.nextInt(200);
            System.out.print(nums[i] + " ");
        }

        Arrays.sort(nums);

        System.out.println();
        System.out.print("Отсортированный массив: ");

        for (int i = 0 ; i < size ; i++ ){
            System.out.print(nums[i] + " ");
        }

        System.out.println();
        System.out.print("Массив в обратном порядке: ");

        for (int i=size;i >= 0;i--) {
            System.out.print(nums[i] + " ");
        }
    }
}


//    Напишите программу, в которой создается целочисленный массив,
//    заполняется случайными числами и после этого значения элементов
//    в массиве сортируются в порядке убывания значений.