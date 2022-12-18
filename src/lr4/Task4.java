package lr4;

public class Task4 {
    public static void main(String[] args) {
        int[][] nums = new int[10][10];
        int k = 10, p = 0;
        for (int i = 1 ; i <= k; i++) {
            if (i<10) {
                System.out.print("номер строки:  " + i + " ");
            } else {
                System.out.print("номер строки: " + i + " ");
            }
            int z = 0;
            for (int j = 0; j < p+1; j++){
//                System.out.print("[]");
                z++;
                nums[p][j] = 2;
                System.out.print(nums[p][j]);
            }
            for (int s = (k-z); s >= 0; s--){
                System.out.print(" ");
            }
            p++;
            System.out.println("Количество символов в строке " + z);
        }

    }
}
