package boj_step3;

import java.util.Scanner;

public class boj_10950 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int [] add = new int[t];

        for (int i = 0; i <t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            add[i] = a+b;
        }

        for(int i = 0; i<add.length;i++){
         System.out.println(add[i]);
        }
    }
}
