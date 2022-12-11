package lr3;

public class Task7 {
    public static void main(String[] args) {

        int i = 0, k = 0, j = 10;
        String letters = "abcdefghijklmnopqrstuvwxyz";
        char[] sym = new char[letters.length()];
        char[] arr = new char[j];

        for (char letter : letters.toCharArray()) {
            sym[i] = letter;
            i++;
        }

        for (i=0;i < j;i++) {
            arr[i] = sym[k];
            k +=2;
        }

        System.out.println(arr);
        for (i=9;i >= 0;i--) {
            System.out.print(arr[i]);
        }
    }
}


//    Напишите программу, в которой создается одномерный символьный массив из 10 элементов.
//    Массив заполняется буквами «через одну», начиная с буквы ' а ':
//    то есть массив заполняется буквами ' а ' , ' с ' , ' е ' , ' д ' и так далее.
//    Отобразите массив в консольном окне в прямом и обратном порядке.
//    Размер массива задается переменной.