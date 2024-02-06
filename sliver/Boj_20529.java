package sliver;

import java.util.Scanner;

public class Boj_20529 {
    private static final int MBTI_CNT = 16;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            String[] mbtis = new String[N];
            for (int i = 0; i < N; i++) {
                mbtis[i] = scanner.next();
            }
            System.out.println(solve(N, mbtis));
        }
        scanner.close();
    }

    private static int getDist(String a, String b, String c) {
        int dist = 0;
        for (int i = 0; i < a.length(); i++) {
            dist += (a.charAt(i) != b.charAt(i) ? 1 : 0) + (b.charAt(i) != c.charAt(i) ? 1 : 0) + (c.charAt(i) != a.charAt(i) ? 1 : 0);
        }
        return dist;
    }

    private static int solve(int N, String[] mbtis) {
        if (N > MBTI_CNT * 2)
            return 0;

        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    answer = Math.min(answer, getDist(mbtis[i], mbtis[j], mbtis[k]));
                }
            }
        }
        return answer;
    }
}
