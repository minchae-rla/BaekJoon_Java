package day27;

import java.util.Scanner;

public class BaekJoon_3009 {
	public static void main(String[] args) {
		//문제번호.3009
		//세점(좌표)를 입려했을때 직사각형을 만들기 위한 네번째 점(좌표)를 구하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		//좌표는 (x,y)두개를 입력해야하므로 []배열로 입력
		int[] a = { sc.nextInt(), sc.nextInt() };
		int[] b = { sc.nextInt(), sc.nextInt() };
		int[] c = { sc.nextInt(), sc.nextInt() };
		
		//더이상 입력이 필요하지 않으므로 종료
		sc.close();
		
		//구할좌표 변수 선언
		int x;
		int y;
		
		// x 좌표 비교 후 쌍을 이루지 않는 x좌표를 저장
				// 1번 x좌표와 2번 x좌표 비교 
				if (a[0] == b[0]) {	
					x = c[0];
				}
				// 1번 x좌표와 3번 x좌표 비교
				else if (a[0] == c[0]) {
					x = b[0];
				}
				// 2번 x좌표와 3번 x좌표 비교
				else {
					x = a[0];
				}
		 
				// y 좌표 비교
				// 1번 y좌표와 2번 y좌표 비교
				if (a[1] == b[1]) {
					y = c[1];
				}
				// 1번 y좌표와 3번 y좌표 비교
				else if (a[1] == c[1]) {
					y = b[1];
				}
				// 2번 y좌표와 3번 y좌표 비교
				else {
					y = a[1];
				}
				
				System.out.println(x + " " + y);
		
		
	}

}
