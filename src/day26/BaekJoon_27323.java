package day26;

import java.util.Scanner;

public class BaekJoon_27323 {
	public static void main(String[] args) {
		//문제번호.27323
		//직사각형의 넓이 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt(); 	//horizontal 가로
		int v = sc.nextInt();	//vertical 세로
		
		System.out.println(h * v);
	}

}
