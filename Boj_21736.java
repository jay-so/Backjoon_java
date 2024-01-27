package sliver;

import java.util.Scanner;

public class Boj_21736 {
    static int N;
    static int M;

    static char[][] campus;
    static boolean[][] visit;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int result = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        campus = new char[N][M];
        visit = new boolean[N][M];

        int r = 0;
        int c = 0;

        for (int i = 0; i < N; i++) {
            String s = sc.next();
            for (int j = 0; j < M; j++) {
                campus[i][j] = s.charAt(j);
                if (campus[i][j] == 'i') {
                    r = i;
                    c = j;
                }
            }
        }

        DFS(r, c);

        if (result == 0)
            System.out.println("TT");
        else
            System.out.println(result);
    }

    public static void DFS(int x, int y) {
        visit[x][y] = true;

        if (campus[x][y] == 'P')
            result++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < M && !visit[nx][ny]) {
                if (campus[nx][ny] != 'X') {
                    DFS(nx, ny);
                }
            }
        }
    }
}
