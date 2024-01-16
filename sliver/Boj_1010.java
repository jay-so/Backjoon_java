package sliver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1010 {
    static final int MAX = 31;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int l = Integer.parseInt(st.nextToken());
        int[][] dp = new int[MAX][MAX];

        for (int i = 0; i < MAX; i++)
            for (int j = 0; j < MAX; j++) {
                if (i < j) continue;
                else if (i == j || j == 0) dp[i][j] = 1;
                else dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }

        while (l-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            sb.append(dp[m][n]).append("\n");
        }
        System.out.println(sb);
    }
}
