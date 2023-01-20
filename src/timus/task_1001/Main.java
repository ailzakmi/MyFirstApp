package timus.task_1001;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        ArrayList<Double> f = new ArrayList<Double>();

        while (in.hasNextLong()) {
            f.add((double) Math.sqrt(in.nextLong()));
        }
        for(int i = f.size()-1;i>=0;i--){
            System.out.printf("%8.6f\n",f.get(i));
        }
    }
}