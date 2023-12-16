package sliver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Boj_2751 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(scan.nextInt());
        }

        Collections.sort(list);

        for (Integer c : list) {
            sb.append(c).append("\n");
        }
        System.out.println(sb);
    }
}
