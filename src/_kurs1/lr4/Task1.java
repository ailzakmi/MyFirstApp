package _kurs1.lr4;

public class Task1 {
    public static void main(String[] args) {
        int k = 11;
        for (int i = 1 ; i <= k; i++) {
            if (i<10) {
                System.out.print("номер строки:  " + i + " ");
            } else {
                System.out.print("номер строки: " + i + " ");
            }
            int z = 0;
            for (int j = -12; j < k; j++){
                System.out.print("+");
                z = z + 1;
            }
            System.out.println(" Количество символов в строке " + z);
        }

    }
}
