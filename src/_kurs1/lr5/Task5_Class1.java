package _kurs1.lr5;

public class Task5_Class1 {
    private int intSim;

    public Task5_Class1() {
        this.intSim = 0;
    }
    public Task5_Class1(int intSim) {
        if (intSim > 100) {
            this.intSim = 100;
        } else {
            this.intSim = intSim;
        }
    }

    public void setSimvol() {
        this.intSim = 0;
    }
    public void setSimvol(int intSim) {
        if (intSim > 100) {
            this.intSim = 100;
        } else {
            this.intSim = intSim;
        }
    }

    public int getAll() {
        return intSim;
    }
}
