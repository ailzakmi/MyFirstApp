package _kurs2.Spec.lr4;

public class PlusMinus {
    public static void main(String[] args) {
        boolean x = false;
        boolean y = true;
        boolean z1,z2;

        z1 = (x^y)^(x^y)&x;
        z2 = (x^y)&x;

        if (z1 & z2) {
            System.out.println("Правильно");
        } else if ((z1 | z2) == false) {
            System.out.println("Правильно");
        } else {
            System.out.println("Неправильно");
        }

    }
}