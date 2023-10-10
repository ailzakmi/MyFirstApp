package _kurs1.lr5;

public class Task4_Class1 {
    private char[] simvol = new char[1];
    private int intSim1;
    private int intSim2;
    String all;

    public void setSimvol(double doobleS) {
        intSim1 = (int) doobleS;
        simvol[0] = (char) intSim1;
        doobleS = (doobleS % 1);
        intSim2 = (int) (doobleS * 100);
        all = simvol[0] + " " + intSim2;
    }

    public void setSimvol(double simvol1, String simvol2) {
        intSim2 = (int) simvol1;

//        this.simvol =  simvol2.toCharArray();
        intSim1 = Integer.parseInt(simvol2);
        simvol[0] = (char) intSim1;
        all = simvol[0] + " " + intSim2;
    }

    public String getAll() {
        return all;
    }
}
