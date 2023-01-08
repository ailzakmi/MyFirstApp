package lr6;

public class Task8_Class1 {
    private int k = 0;
    private int[] arr;
    public Task8_Class1() {
    }

    public void setk(int k) {
        arr = new int[k];
    }

    public void set(int Sm,int j) {
        this.arr[j] = Sm;
        k = k + arr[j];
    }
    public int getSr() {
        return k / arr.length;
    }
}
