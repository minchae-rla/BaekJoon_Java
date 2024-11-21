package day24;

import java.util.Scanner;

public class BaekJoon_2501 {
	public static void main(String[] args) {
		//문제번호.2501
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		//약수의 개수를 세는 변수
        int count = 0;
        
        for(int i = 1; i <= num1; i++){
            if(num1 % i == 0)
            	count++;

            if(count == num2) {
                System.out.println(i);
                break;
            }
        }
        if(count < num2) System.out.println(0);
    }
}