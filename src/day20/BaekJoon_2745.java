package day20;

import java.util.Scanner;

public class BaekJoon_2745 {
	public static void main(String[] args) {
		//문제번호.2745
		//B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
		//10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
		//A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
		
		Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int b = sc.nextInt();

        long result = 0;
        int idx = 0;
        int num = 0;
        for (int i = n.length()-1; i >= 0; i--) {
            char c = n.charAt(i);
            if (c>='0' && c<='9')
                num = c - '0';
            else
                num = c - 55;
            result += num * Math.pow(b, idx++);
        }
        System.out.println(result);
    }
}