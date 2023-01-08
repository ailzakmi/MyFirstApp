package lr6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Task2_Class1 cr = new Task2_Class1();
        Scanner scanner = new Scanner(System.in);
        int k;

        System.out.print("Введите сколько раз вы хотите вызвать функцию: ");
        k = scanner.nextInt();

        for (int i = 0;i < k;i++) {
            System.out.println();
            System.out.print(cr.getI());
        }


    }
}


//2. Напишите программу с классом, в котором есть закрытое статическое
//        целочисленное поле с начальным нулевым значением. В классе должен быть описан
//        статический метод, при вызове которого отображается текущее значение статического
//        поля, после чего значение поля увеличивается на единицу.