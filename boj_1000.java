package boj_step1;
import java.util.Scanner;

public class boj_1000 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if((a<=0)&&(a>=10)){
            System.out.print("a에 1에서 9사이의 수를 입력해주세요!");
            return;
        }

        if((b<=0)&&(b<=10)){
            System.out.print("b에 1에서 9사이의 수를 입력해주세요!");
            return;
        }
        System.out.print(a+b);
    }
}
