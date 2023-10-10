package _kurs1.lr5;

public class Task6_Class1 {
    private int max,min;
    String all;

    public Task6_Class1() {
        this.max = this.min = 0;
    }
    public Task6_Class1(int intSim) {
        if (intSim > max) {
            min = max;
            max = intSim;
        } else {
            min = intSim;
        }
    }
    public Task6_Class1(int intSim1, int intSim2) {
        if (intSim1 > intSim2) {
            min = intSim2;
            max = intSim1;
        } else {
            min = intSim1;
            max = intSim2;
        }
    }

    public void setSimvol() {
        this.max = this.min = 0;
    }

    public void setSimvol(int intSim) {
        if (intSim > max) {
            min = max;
            max = intSim;
        } else {
            min = intSim;
        }
    }

    public void setSimvol(int intSim1, int intSim2) {
        if (intSim1 > intSim2) {
            min = intSim2;
            max = intSim1;
        } else {
            min = intSim1;
            max = intSim2;
        }
    }

    public String getAll() {
        all = "Максимальное значение = " + max + ", минимальное значение = " + min;
        return all;
    }
}
