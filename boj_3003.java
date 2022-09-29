package boj_step1;
import java.util.Scanner;

public class boj_3003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] chess = {1,1,2,2,2,8};
        for(int i = 0;i<=6;i++){
            int now = sc.nextInt();
            System.out.print((chess[i] -now) + " ");
        }
    }
}
