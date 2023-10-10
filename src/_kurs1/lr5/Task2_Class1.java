package _kurs1.lr5;

import java.util.Arrays;

public class Task2_Class1 {
    private char[] simvol = new char[1];
    private final int[] intSim1 = new int[1];
    private final int[] intSim2 = new int[1];

    public void setSimvol1(String simvol) {
        this.simvol =  simvol.toCharArray();
        this.intSim1[0] = this.simvol[0];
    }
    public void setSimvol2(String simvol) {
        this.simvol =  simvol.toCharArray();
        this.intSim2[0] = this.simvol[0];
    }

    public String getAll() {
        int i;
        if (intSim2[0] < intSim1[0]) {
            i = intSim1[0] - intSim2[0] + 1;
            simvol[0] = (char) intSim1[0];
            intSim1[0] = intSim2[0];
            intSim2[0] = simvol[0];
        } else {
            i = intSim2[0] - intSim1[0] + 1 ;
        }
        String[] znac = new String[i];
        for (int j = 0; j<i; j++) {
            simvol[0] = (char) intSim1[0];
            intSim1[0]++;
            znac[j] = Arrays.toString(simvol);
        }
        return Arrays.toString(znac);
    }
}
