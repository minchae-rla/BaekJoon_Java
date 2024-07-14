package day12;

import java.util.Scanner;

public class BaekJoon_27866 {
	public static void main(String[] args) {
		//문제번호.27866
		//단어 
		//S와 정수 I가 주어졌을 때, S의 I번째 글자를 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		int num = sc.nextInt();
		
		System.out.println(word.charAt(num - 1));
	}

}
