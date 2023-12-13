package boj_Gold.bronze;

import java.util.Scanner;

public class Boj_2739 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if((1<=n)&&(n<=9)){
            for(int i = 1;i<=9;i++){
                System.out.println( n +" * " + i +" = " + n*i );
            }


        }else {
            System.out.println("n에 1에서 9사이의 수를 넣어주세요!");
        }

    }
}
