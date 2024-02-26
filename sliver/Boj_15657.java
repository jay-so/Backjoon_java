package sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Boj_15657 {
    private static int n;
    private static int m;
    private static List<Integer> info;
    private static int[] res;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        res = new int[m];
        String[] string = br.readLine().split(" ");
        info = Arrays.stream(string).map(Integer::parseInt).sorted().collect(Collectors.toList());

        combination15653(0, 0);
        System.out.println(sb);
    }

    private static void combination15653(int index, int start) {
        if (index == m) {
            for (Integer integer : res) {
                sb.append(integer).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < n; i++) {
            res[index] = info.get(i);
            combination15653(index + 1, i);
        }
    }
}
