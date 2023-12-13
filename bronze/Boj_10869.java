package boj_Gold.bronze;
import java.util.Scanner;

public class Boj_10869 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if((a<=0)&&(a>=10001)){
            System.out.println("a에 1에서 10000 사이의 수를 입력해주세요");
        }else if((b<=0)&&(b>=10001)){
            System.out.println("b에 1에서 10000 사이의 수를 입력해주세요");
        }else {
            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a*b);
            System.out.println(a/b);
            System.out.println(a%b);
        }

    }
}
