package boj_Gold.bronze;

import java.util.Scanner;

public class Boj_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int value = sc.nextInt();

        m += value;
        if (m >= 60) {
            while (m >= 60) {
                m -= 60;
                h++;
                if (h >= 24) {
                    h = 0;
                }
            }
        }
        System.out.println(h + " " + m);
    }
}
