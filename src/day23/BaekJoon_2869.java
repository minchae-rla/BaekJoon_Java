package day23;

import java.util.Scanner;

public class BaekJoon_2869 {
	public static void main(String[] agrs) {
		//문제번호 .2869
		
		//입력을 위한 스캐너 import
		Scanner sc = new Scanner(System.in);
		
		//달팽이가 올라가야하는 높이 V
		//달팽이가 하루에 올라가는 높이 A
		//달팽이가 자는동안 떨어지는 높이 B
		
		//하루에 올라가는 높이 -> D
		//단순하게 생각하면 A+D = V일때 종료(그동안 걸린 일수 계산)
		//하루에 다 올라가는 경우도 생각 while문에 if로 계산구하기
		
		//시간이 오래걸려서 오답
//		//총높이
//		int V = 0;
//		//한번에올라가는높이
//		int A = 0;
//		//자는동안 떨어지는 높이
//		int B = 0;
//		//하루에 올라가는 높이
//		int C = 0;
//		//그동안올라간높이
//		int total = 0;
//		//걸린일수
//		int day = 0;
//		
//		//목표에 도달할때까지 반복 반복될때마다 day추가
//		  while (total < V) {
//	            day++;
//	            total += A;
//	            
//	            if (total >= V) {
//	                break;
//	            }
//	            total -= B; // 밤에 떨어지는 높이 B만큼 떨어짐
//	        }
//	        
//	        // 결과 출력
//	        System.out.println(day); // 걸린 일수 출력
		
		int up = sc.nextInt();		// A
		int down = sc.nextInt();	// B
		int length = sc.nextInt(); 	// C
 
		int day = (length - down) / (up - down);
        
		// 나머지가 있을 경우 (잔여 블럭이 있을 경우)
		if ((length - down) % (up - down) != 0) {
			day++;
		}
		System.out.println(day);

	    }
	}