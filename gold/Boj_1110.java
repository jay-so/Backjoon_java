package boj_Gold.gold;

import java.util.Scanner;

public class Boj_1110 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.close();

        int count = 0;
        int copy = N;

        while (true){
            N = ((((N/10)+(N%10))%10) + ((N%10) * 10) );
            count++;

            if(copy == N){
                break;
            }
        }
        System.out.println(count);
    }
}
