package day12;

import java.util.Scanner;

public class BaekJoon_9086 {
	public static void main(String[] args) {
		//문제번호.9086
		//문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		for(int i = 0; i < num ; i++) {
			String str = sc.next();
			System.out.println(str.charAt(0) + "" + str.charAt(str.length()-1));
		}
		
//		String word = sc.nextLine();

//		System.out.println(word.charAt(0));
//		System.out.println(word.charAt(word.length() - 1));
	}

}
