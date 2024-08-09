package day19;

import java.util.Scanner;

public class BaeJoon_10798 {
	public static void main(String[] args) {
		// 문제번호.10798
		// 2차원배열입력값을 세로로 출력하기
		Scanner sc = new Scanner(System.in);

		char[][] board = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String input = sc.next(); // 문자열로 입력받기
            for (int j = 0; j < 15; j++) {
                if (j < input.length()) {
                    board[i][j] = input.charAt(j); // 문자열의 각 문자를 char 배열에 저장
                } else {
                    board[i][j] = ' '; // 입력이 부족할 경우 공백으로 채우기
                }
            }
        }
		
		for(int j = 0 ; j < 15 ; j++) {
			for(int i = 0 ; i < 5 ; i++) {
				if(board[i][j] != ' ')
				System.out.print(board[i][j]);
			}
		}
	}
}
