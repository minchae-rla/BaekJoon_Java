package day21;

import java.util.Scanner;

public class BaekJoon_11005 {
	public static void main(String[] args) {
		//문제번호.11005
		//10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.
		//10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
		//A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(Integer.toString(a, b).toUpperCase());
    }
}