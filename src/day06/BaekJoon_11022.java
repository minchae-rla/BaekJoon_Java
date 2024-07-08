package day06;

import java.util.Scanner;

public class BaekJoon_11022 {
	public static void main(String[] args) {
		//문제번호.11022
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		//각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		for(int i = 1 ; i <= count ; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println("Case #" + i + ": " + num1 + " + " + num2 + " = " + (num1 + num2));
		} 
	}

}
