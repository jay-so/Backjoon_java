package boj_Gold.bronze;

import java.util.Scanner;

public class Boj_2675 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for(int i =0; i<t;i++){
            int r = scanner.nextInt();
            String sc = scanner.next();

            for(int j = 0;j< sc.length();j++){
                for(int k =0 ;k<r;k++){
                    System.out.print(sc.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
