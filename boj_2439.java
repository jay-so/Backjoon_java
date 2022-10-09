package boj_step3;

import java.util.Scanner;

public class boj_2439 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 1;i<=n;i++){
            for(int j = n;j-1<0;j--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
