package boj_Gold.bronze;

import java.util.Scanner;

public class Boj_2438 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int z = 1;z<=i;z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
