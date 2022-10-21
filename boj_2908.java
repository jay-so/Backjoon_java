package boj_step6;

import java.util.Scanner;

public class boj_2908 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.close();

        a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
        b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());

        System.out.print(a>b?a:b);
    }
}
