package day25;

import java.util.Scanner;

public class BaekJoon_1978 {
	public static void main(String[] args) {
		//문제번호.1978
		//입력한 수들 중 소수의 개수 구하기
		
        Scanner sc = new Scanner(System.in);
        //입력할 숫자의 개수(몇개입력할것인지)
        int num = sc.nextInt();
        //진짜 소수인지 판별할 숫자들
        int primeNumber;
        //소수의 개수 저장한 변수
        int count = 0;
        
        for(int i = 0 ; i  <num ; i++){
        	primeNumber = sc.nextInt();
            for(int p = 2; p <= primeNumber; p++){
                if(p == primeNumber){
                	count++;
                }
                if(primeNumber % p == 0){
                    break;
                }
            }
        }
        System.out.println(count);
	}

}
