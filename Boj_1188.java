package boj_Gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1188 {
    static int n;
    static int m;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        System.out.println(m - gcd(n,m));
    }

    public static int gcd(int a, int b){
        {
            while (b > 0) {
                int temp = a;
                a = b;
                b = temp %b;
            }
            return  a;
        }
    }
}
