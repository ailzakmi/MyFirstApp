package lr11.Example3;

import java.util.Random;

public class Task {
    static Random rand = new Random();
    private static int index = 0;

    public static void main(String[] args) {
        int[] massive = new int[10];
        massive = inputArray(massive);
        outputArray(massive);
    }

    // Заполнение массива случайными числами
    public static int[] inputArray(int[] arr){
        if (index == arr.length){
            index = 0;
            return arr;
        }
        arr[index] = rand.nextInt(100);
        index++;
        return inputArray(arr);
    }

    //Вывода элементов массива
    public static int [] outputArray(int[] arr){
        if (index == arr.length) {
            index = 0;
            return arr;
        }
        else {
            System.out.println("[" + index + "]= " + arr[index]);
            index++;
            return outputArray(arr);
        }
    }
}

//        3. Создать приложение, позволяющее ввести и вывести
//        одномерный массив целых чисел. Для ввода и вывода массива
//        разработать рекурсивные методы вместо циклов for.