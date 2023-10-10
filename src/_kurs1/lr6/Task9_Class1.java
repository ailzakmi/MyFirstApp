package _kurs1.lr6;

import java.util.Arrays;

public class Task9_Class1 {
    private int k;
    private int[] arr;
    public Task9_Class1() {
    }

    public void setk(int k) {
        arr = new int[k];
        this.k = k;
    }

    public void set(int Sm,int j) {
        this.arr[j] = Sm;
    }
    public void Rasp() {
        int mn;
        for (int i=0;i<k;i++) {
            mn = arr[k-1-i];
            arr[k-1-i] = arr[i];
            arr[i] = mn;
            if (i+1 == k/2) break;
        }
    }

    public String get() {
        return Arrays.toString(arr);
    }
}
