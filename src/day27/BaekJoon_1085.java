package day27;

import java.util.Scanner;

public class BaekJoon_1085 {
	public static void main (String[] args) {
		//문제번호.1085
		//x,y좌표를 정해주고 직사각형 크기를 설정하여 직사각형 경계선에 닿는 최단거리 구하기
		//직사각형은 평행하며 (0,0)에서 시작함
		
		Scanner sc= new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		//x축 최소거리
		int x_min = Math.min(x, w-x);
		//y축 최소거리
		int y_min = Math.min(y, h-y);
        
		// x와 y축 최소거리 중 가장 작은 값
		System.out.println(Math.min(x_min, y_min));
	}

}
