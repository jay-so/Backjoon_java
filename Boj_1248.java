package boj_Gold;
import java.io.*;
import java.util.*;

public class Boj_1248 {
    public static int N;
    public static int ans[];
    public static boolean visited [][];
    public static String query;
    public static int len;
    public static char str[][];
    public static boolean check(int idx){
        int sum = 0;
        for(int i=idx;i>=0;i--){
            sum+=ans[i];
            if(str[i][idx]=='+' && sum<=0) return false;
            if(str[i][idx]=='0' && sum!=0) return false;
            if(str[i][idx]=='-' && sum>=0) return false;
        }
        return true;
    }
    public static void dfs(int idx){
        if(idx==N){
            for(int i=0;i<N;i++){
                System.out.print(ans[i] + " ");

            }
            System.exit(0);
        }
        for(int i=-10;i<=10;i++){
            ans[idx] = i;
            if(check(idx)){
                dfs(idx+1);
            }

        }

    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        ans  = new int[N];
        visited = new boolean[11][22]; //N번째 원소, 21개의 수
        query = br.readLine();
        len = N*(N-1)/2;
        str = new char[N][N];
        int temp = 0;
        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                str[i][j] = query.charAt(temp++);
            }
        }
        dfs(0);
    }

}
