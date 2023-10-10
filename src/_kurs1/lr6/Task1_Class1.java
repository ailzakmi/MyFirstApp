package _kurs1.lr6;

import java.util.Arrays;

public class Task1_Class1 {

    private final char[] smt = new char[1];
    private char sivol;
    private String text;

    public Task1_Class1() {
        this.sivol = 0;
        this.text = "0";
    }

    public void set0(char siv) {
        siv = 0;
        this.sivol = siv;
    }

    public void set0(String siv) {
        siv = "0";
        this.text = siv;
    }

    public void set(char Sm) {
        this.sivol = Sm;
    }
    public void set(String Sm) {
        this.text = Sm;
    }

    public String get() {
        if (this.sivol == 0) {
            return text;
        } else {
            smt[0] = sivol;
            return Arrays.toString(smt);
        }
    }
}
