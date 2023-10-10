package _kurs1.lr3;

import java.util.Arrays;
import java.util.Random;

public class Task9 {
    public static void main(String[] args) {

        Random random = new Random();
        int size = 10, min;
        int[] nums = new int[size];

        for (int i = 0 ; i < size ; i++ ){
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
        }
        Arrays.sort(nums);
        System.out.println();
        min = nums[0];
        for (int i = 0 ; i < size ; i++ ){
            if (nums[i] <= min) {
                System.out.println("Минимальный элемент массива [" + i + "] равен = " + nums[i]);
            }
        }
    }
}


//    Напишите программу, в которой создается массив и заполняется случайными числами.
//    Массив отображается в консольном окне.
//    В этом массиве необходимо определить элемент с минимальным значением.
//    В частности, программа должна вывести значение элемента с минимальным значением и индекс этого элемента.
//    Если элементов с минимальным значением несколько, должны быть выведены индексы всех этих элементов.