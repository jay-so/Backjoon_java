package boj_step1;

import java.math.BigInteger;
import java.util.Scanner;

public class boj_1271 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        System.out.println(a.divide(b));
        System.out.println(a.remainder(b));
        sc.close();
    }
}
