package day29;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_14215 {
	public static void main(String[] args) {
		//문제번호.14215
		//세 정수를 입력 후 이 세 숫자로 만들 수 있는 가장 큰 삼각형의 둘레를 구하라
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int[] list = {a, b, c};
		Arrays.sort(list);
		
	    if(list[0]+list[1] > list[2]){
	        System.out.println(a + b + c);
	    }else{
	        System.out.println((list[0]+list[1]) * 2 - 1);
	    }
	}

}
