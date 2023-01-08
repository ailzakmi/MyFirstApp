package lr6;

public class Task4_Class1 {
    private int n,i=0,k=1;
    public Task4_Class1() {
    }

    public void setN(int n) {
        this.n = n;
        Rasp();
    }
    private void Rasp() {
        do {
            k = k * (n - i*2);
            if (((n-i*2) == 2) | ((n-i*2) == 1)) break;
            i++;
        } while (true);
    }

    public int get() {
        return k;
    }
}
