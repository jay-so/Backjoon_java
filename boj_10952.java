package boj_step3;

import java.util.Scanner;

public class boj_10952 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        while (true){

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if((a==0)&&(b==0)){
                scanner.close();
                break;
            }
            System.out.println(a+b);
        }
    }
}