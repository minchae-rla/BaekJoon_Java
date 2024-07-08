package day06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekJoon_155525 {
	public static void main(String[] args) throws Exception, IOException {
		//문제번호.155525
		//두 정수 A+B를 for문을사용하여 반복해서 시행, 단 scanner가 아닌 Buffered를 사용
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	        int T = Integer.parseInt(br.readLine());

	        StringTokenizer st;

	        for(int i=0; i<T; i++){
	            st = new StringTokenizer(br.readLine()," ");
	            int N = Integer.parseInt(st.nextToken());
	            int M = Integer.parseInt(st.nextToken());
	            bw.write((N + M) + "\n");
	        }
	        br.close();

	        bw.flush();     
	        bw.close();
		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			int num1 = sc.nextInt();
//			int num2 = sc.nextInt();
//			int result = num1 * num2;
//			System.out.println(result);
//		} 
	}

}
