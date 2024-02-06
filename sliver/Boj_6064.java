package sliver;

import java.util.Scanner;

public class Boj_6064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            boolean cheak = false;
            int m = sc.nextInt();
            int n = sc.nextInt();
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;

            for (int j = x; j < (n * m); j += m) {
                if (j % n == y) {
                    System.out.println(j + 1);
                    cheak = true;
                    break;
                }
            }

            if (!cheak) {
                System.out.println(-1);
            }
        }
    }
}
