package _kurs1.lr4;

public class Task3 {
    public static void main(String[] args) {
        int[][] nums = new int[10][10];
        int k = 10, s = 0;
        for (int i = 1 ; i <= k; i++) {
            if (i<10) {
                System.out.print("номер строки:  " + i + " ");
            } else {
                System.out.print("номер строки: " + i + " ");
            }
            int z = 0;
            for (int j = 0; j < k; j++){
//                System.out.print("+");
                z = z + 1;
                nums[s][j] = 2;
                System.out.print(nums[s][j]);
            }
            s++;
            System.out.println(" Количество символов в строке " + z);
        }
    }
}
