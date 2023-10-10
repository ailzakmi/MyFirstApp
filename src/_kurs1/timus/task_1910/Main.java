package _kurs1.timus.task_1910;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/_kurs1.timus/task_1910/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        BufferedReader bufferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                        new BufferedReader(new FileReader(inputFileName));

        int size = Integer.parseInt(bufferedReader.readLine());
        String[] strings = bufferedReader.readLine().split(" ");
        int[] integer = new int[size-2];

        for (int i=0;i<integer.length;i++) {
            integer[i] = Integer.parseInt(strings[i]) +
                Integer.parseInt(strings[i+1]) +
                Integer.parseInt(strings[i+2]);
        }

        int[] ints = Arrays.copyOf(integer, integer.length);
        Arrays.sort(integer);

        int firstValue = integer[integer.length-1];

        for (int i=0;i < integer.length;i++) {
            if (ints[i] == firstValue) {
                System.out.println(firstValue + " " + (i + 2));
                break;
            }
        }
        System.out.flush();
    }
}
