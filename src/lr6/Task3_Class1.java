package lr6;

import java.util.Arrays;

public class Task3_Class1 {

    private int k = 0,min,max;
    private int[] arr;
    public Task3_Class1() {
    }

    public void setk(int k) {
        arr = new int[k];
    }

    public void set(int Sm,int j) {
        this.arr[j] = Sm;
//        this.max = this.min = arr[0];
//        if (this.max<arr[j]) this.max = arr[j];
//        if (this.min>arr[j]) this.min = arr[j];
        k = k + arr[j];
        Rasp();
    }
    private void Rasp() {
        this.max = this.min = arr[0];
        for (int i=0;i<arr.length;i++) {
            if (this.max<arr[i]) this.max = arr[i];
            if (this.min>arr[i]) this.min = arr[i];
//            k = k + arr[i];
        }
//        sr = k / arr.length;
    }

    public String get() {
        return Arrays.toString(arr);
    }

    public int getMax() {
        return max;
    }
    public int getMin() {
        return min;
    }
    public int getSr() {
        return k / arr.length;
    }

    public String getAll() {
        return "Максимальное значение: " + max + ", минимальние значение: " + min + ", среднее значение: " + k / arr.length + ".";
    }
}
