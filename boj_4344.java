package boj_step4;

import java.util.Scanner;

public class boj_4344 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int []arr;

        int testCase = scanner.nextInt();

        for(int i = 0;i<testCase;i++){
            int n = scanner.nextInt();
            arr = new int[n];

            double sum = 0;

            for(int j = 0;j<n;j++){
                int val = scanner.nextInt();
                arr[j] = val;
                sum += val;
            }

            double average = (sum/n);
            double count = 0;

            for(int j = 0;j<n;j++){
                if(arr[j]>average){
                    count ++;
                }
            }
         System.out.printf("%.3f%%\n",(count/n)*100);

        }
        scanner.close();
    }
}
