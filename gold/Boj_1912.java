package boj_Gold.gold;
import java.util.Scanner;

public class Boj_1912 {
    static int[] arr;		// 배열
    static Integer[] dp;		// 메모이제이션 할 dp
    static int max;			// 최댓값 변수

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        arr = new int[N];
        dp = new Integer[N];

        for(int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        dp[0] = arr[0];
        max = arr[0];

        recur(N - 1);

        System.out.println(max);
    }

    static int recur(int N) {

        // 탐색하지 않은 인덱스라면
        if(dp[N] == null) {
            dp[N] = Math.max(recur(N - 1) + arr[N], arr[N]);

            // 해당 dp[N]과 max 중 큰 값으로 max 갱신
            max = Math.max(dp[N], max);
        }

        return dp[N];
    }
}
