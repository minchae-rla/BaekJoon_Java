package day18;

import java.util.Scanner;

public class BaekJoon_1157 {
	public static void main(String[] args) {
		// 문제번호.1157
		// 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와
		// 소문자를 구분하지 않는다.
		Scanner sc = new Scanner(System.in);
		// 단어 입력 실행
		String str = sc.next();

		// 입력받은 단어의 길이(인덱스값으로 이용하기 위해서)
		int len = str.length();

		// 반복된 횟수 최대값 max, 반복된 배열의 번호(알파벳번호) arr_num, max로 넘기기전 수를 세는 count 선언
		int max = 0, arr_num = 0, count = 0;
		// 알파벳 개수 만큼 배열선언
		char alp_arr[] = new char[26];

		for (int i = 0; i < len; i++) {
			int num = str.charAt(i) - 65; // 문자열을 char형으로 바꾼 뒤 -65 (ASCII 코드 65: A ~ 122: z)

			if (num >= 32 && num <= 57) // 소문자로 입력받은 경우에 대문자로 바꿔주기 (ASCII 코드 65:A, 97: a)
				num -= 32;

			alp_arr[num] += 1; // 해당하는 배열에 +1 ( a는 alp_arr[0], b는 alp_arr[1] ... )
		}

		for (int i = 0; i < alp_arr.length; i++) {
			if (alp_arr[i] > max) { // max값 구하기, max값의 배열번호 arr_num에 저장
				max = alp_arr[i];
				arr_num = i;
			}
		}

		for (int i = 0; i < alp_arr.length; i++) {
			if (max == alp_arr[i]) { // for문을 한번 더 실행해서 max값과 동일한 값의 인덱스가 존재하는경우 count++
				count++;
			}
		}

		if (count >= 2) { // count가 2 이상인 경우 ? 출력
			System.out.println('?');
		} else {
			System.out.println((char) (arr_num + 65));
		}

	}
}