package boj_Gold.gold;

import java.math.BigInteger;
import java.util.Scanner;

public class Boj_1271 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        System.out.println(a.divide(b));
        System.out.println(a.remainder(b));
        sc.close();
    }
}
