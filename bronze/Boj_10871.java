package boj_Gold.bronze;

import java.util.Scanner;

public class Boj_10871 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []array = new int[n];
        int x = scanner.nextInt();

        for(int i = 0;i<=n-1;i++){
            int a = scanner.nextInt();
            array[i] = a;

            if(array[i]<x)
                System.out.print(array[i]+ " ");
        }
        scanner.close();
    }
}
