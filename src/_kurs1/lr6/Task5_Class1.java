package _kurs1.lr6;

public class Task5_Class1 {
    private int n,i=1,k=0;
    private String result;
    public Task5_Class1() {
        result = "";
    }

    public void setN(int n) {
        this.n = n;
        Rasp();
    }
    private void Rasp() {
        int j = 2;
        while (n>=i) {
            k = k + (j + i*10);
            result = result + (j + i*10);
            if (n!=i) result = result + " + ";
            i++;
        }
    }

    public String get() {
//        result = result + " = " + k;
        return result;
    }

    public int getK() {
        return k;
    }
}
