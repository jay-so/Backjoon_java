package boj_step4;

import java.util.Arrays;
import java.util.Scanner;

public class boj_10818 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[]numbers = new int[count];

        for(int i = 0;i<count;i++){
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(numbers);
        System.out.println(numbers[0] + " " +numbers[count-1]);
    }
}
