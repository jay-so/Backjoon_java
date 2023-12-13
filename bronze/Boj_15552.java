package boj_Gold.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_15552 {
    public static void main(String[]args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<t;i++){
            st = new StringTokenizer(bf.readLine()," ");
            sb.append(Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken())).append('\n');
        }
        bf.close();

        System.out.println(sb);


    }
}
