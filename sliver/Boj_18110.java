package sliver;

import java.io.BufferedReader;
import java.io.*;
import java.util.Arrays;

public class Boj_18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        Arrays.sort(arr);

        int t = (int) Math.round(n * 0.15);

        double sum = 0;
        for (int i = t; i < n - t; i++) {
            sum += arr[i];
        }

        System.out.println((int) Math.round(sum / (n - 2 * t)));
        bufferedReader.close();
    }
}
