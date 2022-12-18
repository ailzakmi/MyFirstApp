package lr4;

public class Task2 {
    public static void main(String[] args) {
        int k = 10, m = 0;
        for (int i = 1 ; i <= k; i++) {
            if (i<10) {
                System.out.print("номер строки:  " + i + " ");
            } else {
                System.out.print("номер строки: " + i + " ");
            }
            int z = 0;
            m++;
            for (int j = 0; j < m; j++){
                System.out.print("[]");
                z++;
            }
            for (int s = (k-z); s >= 0; s--){
                System.out.print("  ");
            }
            System.out.println("Количество символов в строке " + z);
        }

    }
}
