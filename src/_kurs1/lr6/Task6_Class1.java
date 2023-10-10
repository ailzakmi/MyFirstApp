package _kurs1.lr6;

import java.util.Arrays;

public class Task6_Class1 {
    private int n,i=0,k;
    private int[] arr,mass;
    public Task6_Class1() {
    }
    public void setk(int k) {
        arr = new int[k];
    }
    public void set(int Sm,int j) {
        this.arr[j] = Sm;
        k = k + arr[j];
    }
    public void setN(int n) {
        this.n = n;
        Rasp();
    }

    private void Rasp() {
        if (arr.length<=n) {
            mass = new int[arr.length];
            while (i<arr.length) {
                mass[i] = arr[i];
                i++;
            }
        } else {
            mass = new int[n];
            while (i<n) {
                mass[i] = arr[i];
                i++;
            }
        }
    }

    public String get() {
        return Arrays.toString(mass);
    }
}
