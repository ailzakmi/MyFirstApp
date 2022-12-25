package lr5;

import java.util.Random;

public class Task3_Class1 {
    private int intSim;
    private Random random = new Random();
    private String all;

    public void setSimvol(String simvol) {
        all = simvol;
    }

    public void setSimvol(String simvol1, String simvol2) {
        all = simvol1 + " " + simvol2;
    }

    public void setRandom () {
        this.intSim = random.nextInt(200);
        all = String.valueOf(intSim);
    }

    public String getAll() {
        return all;
    }
}
