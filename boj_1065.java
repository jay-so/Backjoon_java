package boj_step5;

import java.util.Scanner;

public class boj_1065 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //(1<=n) &&(n<=1000)
        System.out.println(arithmetic_sequence(n));
        sc.close();
    }
    public static int arithmetic_sequence(int num){
        int count = 0;

        //100보다 작은수
        if(num<100){
            return num;
        }else{
            count = 99;

            //100이상의 수
            for(int i = 100;i<=num;i++){
                int hun = i/100; //백의 자릿수
                int ten = (i/10)%10; //십의 자릿수
                int one = i %10;

                if((hun-ten)==(ten-one)){ //각 자릿수가 수열을 이루면
                    count ++;
                }
            }

        }
        return count;
    }
}
