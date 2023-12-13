package boj_Gold.bronze;

import java.util.Scanner;

public class Boj_10998 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if((a<=0)&&(a>=10)){
            System.out.print("a에 1~9사이의 수를 넣어주세요!");
        }

        if((b<=0)&&(b>=10)){
            System.out.print("b에 1~9사이의 수를 넣어주세요!");
        }

        System.out.print(a*b);

    }
}
