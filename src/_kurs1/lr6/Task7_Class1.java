package _kurs1.lr6;

import java.util.Arrays;

public class Task7_Class1 {
    private int[] arr;
    private final char[] simvol = new char[1];
    public Task7_Class1() {
    }
    public void setk(int k) {
        arr = new int[k];
    }
    public void set(char Sm,int i) {
//        this.simvol = Sm.toCharArray();
        this.arr[i] = Sm;
    }

    public String get() {
        return Arrays.toString(arr);
    }
}
