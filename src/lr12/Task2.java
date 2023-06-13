package lr12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ������ �������: ");
        int size = in.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        Random random = new Random();

        for (int i = 0;i<size;i++){
            arr1[i] = random.nextInt(200);
            arr2[i] = random.nextInt(200);
        }
        System.out.println("������ arr1 = ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("������ arr2 = ");
        System.out.println(Arrays.toString(arr2));

        int[] arrResult = resultativ(arr1,arr2);

        System.out.println("������ arrResult = ");
        System.out.println(Arrays.toString(arrResult));
    }
    public static int[] resultativ(int[] arr1, int[] arr2){
        return Arrays.stream(arr1)
                .filter(x -> Arrays.stream(arr2)
                        .anyMatch(y -> y ==x))
                .toArray();
    }
}

//        2. �������� �������, ������� ��������� �� ���� ��� ������� ����� �����
//        � ���������� ����� ������, ���������� ������ �� ��������, ������� ���� � ����� ��������.