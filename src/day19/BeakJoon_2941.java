package day19;

import java.util.Scanner;

public class BeakJoon_2941 {
	public static void main(String[] args) {
		//문제번호.2941
		//입력한 문자열에 포함된 크로아티아 문자의 개수
		Scanner sc =  new Scanner(System.in);
		
		String[] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String word = sc.nextLine();
		int count = 0;
		
		for(int i = 0 ; i < cro.length ; i++) {
			if(word.contains(cro[i])) { //contains함수 안에 요소가 포함되어있는지 확인 포함이면 true, 아니면 false 반환
				word = word.replace(cro[i], "!"); //포함되어 있다면 안에 포함된 문자열을 "!"로 변환 
			}
		}
		System.out.println(word.length());
	}

}

