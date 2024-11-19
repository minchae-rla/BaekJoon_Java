package day22;

import java.util.Scanner;

public class BaekJoon_1193 {
	public static void main(String[] args) {
		//문제번호. 1193
		
		//입력을 위한 스캐너 import
		Scanner sc = new Scanner(System.in);
		
		// 첫째줄 1/1 ~ 1/9
		// 둘째줄 2/1 ~ 2/9 ...
		
		//바둑판 모양의 분수표에서 지그재그 대각선으로 그에 맞는 분수값을 구해야한다
		//ex) 1입력 -> 1/1   2입력 -> 1/2   3입력 ->  2/1 ..... 7입력 -> 1/4
		
		//숫자 입력
		int num = sc.nextInt();
		
		  int floor = 1; // 몇 번째 층에 있을까?  
	       
	       // 층 수를 구해보자
	       while(num-floor > 0) {
	          num -= floor;
	         floor++;
	       }
	       
	       int box = num; // 몇 번째 박스?
	       int hap = floor+1; // 분모와 분자의 합
	       int a=0; int b=0; // 분모, 분자
	       
	       // 홀수층
	       if(floor%2==1) {
	          a = box;
	          b = hap-box;
	       }
	       
	       //짝수층
	       if(floor%2==0) {
	          b = box;
	          a = hap - box;
	       }
	       
	       System.out.println(b +"/" + a);
	    } 
	}
