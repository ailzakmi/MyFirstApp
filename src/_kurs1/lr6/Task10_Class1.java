package _kurs1.lr6;

import java.util.Arrays;

public class Task10_Class1 {
    private int min,max;
    private int[] arr;
    public Task10_Class1() {
    }

    public void setk(int k) {
        arr = new int[k];
    }

    public void set(int Sm,int j) {
        this.arr[j] = Sm;
        Rasp();
    }
    private void Rasp() {
        this.max = this.min = arr[0];
        for (int i=0;i<arr.length;i++) {
            if (this.max<arr[i]) this.max = arr[i];
            if (this.min>arr[i]) this.min = arr[i];
        }

    }

    public String get() {
        return Arrays.toString(arr);
    }

    public int getMax() { return max; }
    public int getMin() {
        return min;
    }

    public String getAll() {
        return "Максимальное значение: " + max + ", минимальние значение: " + min + ".";
    }
}
