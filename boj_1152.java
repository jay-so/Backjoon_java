package boj_step6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class boj_1152 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        scanner.close();

        //공백을 기준으로 나눈 토큰들을 저장함
        StringTokenizer stringTokenizer = new StringTokenizer(s," ");

        //countTokens()는 토큰의 갯수를 반환함
        System.out.println(stringTokenizer.countTokens());

    }
}
