package _kurs1.lr5;

import java.util.Arrays;

public class Task1_Class1 {
    private char[] simvol = new char[1];
    private final int[] intSim = new int[1];
    private String znac;

    public void setSimvol(String simvol) {
        this.simvol =  simvol.toCharArray();
        this.intSim[0] = this.simvol[0];
    }

    public String getSimvol() {
        return Arrays.toString(simvol);
    }

    public String getIntSim() {
        return Arrays.toString(intSim);
    }

    public String getAll() {
        znac = Arrays.toString(simvol) + " " + Arrays.toString(intSim);
        return znac;
    }

}
