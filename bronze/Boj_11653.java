package boj_Gold.bronze;

import java.util.Scanner;

public class Boj_11653 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();

    for (int i = 2; i <= Math.sqrt(N); i++) {	// 또는 i * i <= N
        while (N % i == 0) {
            System.out.println(i);
            N /= i;
        }
    }
    if (N != 1) {
        System.out.println(N);
     }
    }
}
