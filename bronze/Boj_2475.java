package boj_Gold.bronze;

import java.io.IOException;
import java.util.Scanner;

public class Boj_2475 {
    public static void main(String[] args) throws IOException {
        //input
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int temp = scanner.nextInt();
            sum += temp * temp;
        }

        int result = sum % 10;
        System.out.println(result);
    }
}
