package boj_Gold;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_1697_bfs {
    public static final int MAX = 1000000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        if (N >= K) {
            System.out.println(N - K);
        } else {
            int[] time = new int[MAX];
            Queue<Integer> queue = new LinkedList<>();

            queue.add(N);

            while (!queue.isEmpty()) {
                Integer n = queue.poll();
                if (n == K) {
                    System.out.println(time[n]);
                    break;
                }

                if (n + 1 < MAX && time[n + 1] == 0) {
                    queue.add(n + 1);
                    time[n + 1] = time[n] + 1;
                }

                if (n - 1 >= 0 && time[n - 1] == 0) {
                    queue.add(n - 1);
                    time[n - 1] = time[n] + 1;
                }

                if (2 * n < MAX && time[2 * n] == 0) {
                    queue.add(2 * n);
                    time[2 * n] = time[n] + 1;
                }
            }
        }
    }
}
