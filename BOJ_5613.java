package Bronze;

import java.util.Scanner;

public class BOJ_5613 {
    public static void main(String[] args) {
        //입력이 주어짐
        Scanner scanner = new Scanner(System.in);

        //계산 덧셈을 구하는 변수
        int sum = scanner.nextInt();

        //사칙연산
        while (true){
            String operation = scanner.nextLine();
            // =이 나오면 계산 종료
            if(operation.equals("="))
                break;
         switch (operation) {
             //뎃셈
             case "+":
                 sum += scanner.nextInt();
                 break;
             //뺄셈
             case "-":
                 sum -= scanner.nextInt();
                 break;
             //곱셈
             case "*":
                 sum *= scanner.nextInt();
                 break;
             //나눗셈
             case "/":
                 sum /= scanner.nextInt();
                 break;
             default:
                 break;
         }
        }
        System.out.println(sum);
        scanner.close();
    }
}
