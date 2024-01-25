package sliver;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Boj_9375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int n = sc.nextInt();
            Map<String, Integer> map = new HashMap<>();

            for (int j = 0; j < n; j++) {
                String name = sc.next(), type = sc.next();
                map.put(type, map.getOrDefault(type, 0) + 1);
            }

            int ans = 1;
            for (int val : map.values())
                ans *= val + 1;
            System.out.println(ans - 1);
        }
    }
}
