package day24;

import java.util.Scanner;

public class BaekJoon_5086 {
	public static void main(String[] args) {
		//문제번호 .5086
		//두 수를 입력하였을 때, 두 수의 관계를 구하라(배수, 약수, 그외)
		
		Scanner sc = new Scanner(System.in);
		
		//조건을 만족할때까지 반복
		while(true) {		
			
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
	        if(num1 == 0 && num2 == 0){
	            break;
	        }
			//num2을 num1 나눴을때 나머지가 0, 약수관계 ex) num1 = 12 num2 = 3  -> 12/4 == 0
			if(num2 % num1 == 0) {
				System.out.println("factor");
			}
			
			//num1을 num2 나눴을때 나머지가 0, 배수관계 ex) num1 = 3 num2 = 12  -> 3/12 == 0
			else if(num1 % num2 == 0) {
				System.out.println("multiple");
			}
			else {
				System.out.println("neither");
			}
		}

		sc.close();
	}
 
}