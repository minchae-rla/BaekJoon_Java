package day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_25206 {
	public static void main(String[] args) throws IOException {
		//문제번호.25206
		//인하대학교 컴퓨터공학과를 졸업하기 위해서는, 전공평점이 3.3 이상이거나 졸업고사를 통과해야 한다. 그런데 아뿔싸, 치훈이는 깜빡하고 졸업고사를 응시하지 않았다는 사실을 깨달았다!
		//치훈이의 전공평점을 계산해주는 프로그램을 작성해보자.
		//전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double sumNumxScore = 0;
        double sumNum = 0;

        for(int i = 0; i < 20; i++){
            st = new StringTokenizer(br.readLine());
            String object = st.nextToken();
            double num = Double.parseDouble(st.nextToken());
            String alphabet = st.nextToken();
            double score = 0;

            // P가 아닐 때만 체크
            if(!(alphabet.equals("P"))){
                // 과목 평점 계산
                switch (alphabet) {
                    case "A+":
                        score = 4.5;
                        break;
                    case "A0":
                        score = 4.0;
                        break;
                    case "B+":
                        score = 3.5;
                        break;
                    case "B0":
                        score = 3.0;
                        break;
                    case "C+":
                        score = 2.5;
                        break;
                    case "C0":
                        score = 2.0;
                        break;
                    case "D+":
                        score = 1.5;
                        break;
                    case "D0":
                        score = 1.0;
                        break;
                    case "F":
                        score = 0.0;
                        break;
                    default:
                        break;
                }

                sumNumxScore += (num*score);
                sumNum += num;
            }
        }
        // 소수점 아래 6자리까지 출력
        System.out.printf("%.6f", sumNumxScore/sumNum);
        br.close();
    }
}
