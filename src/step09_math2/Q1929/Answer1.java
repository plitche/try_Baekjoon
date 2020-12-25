/* 
	작성자: 권용수
	이메일: kysu728@naver.com
	주소: 서울시 마포구
	GitHub: https://github.com/plitche/try_Baekjoon
*/

package step09_math2.Q1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Answer1 {

	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line, " ");
		int M = Integer.parseInt(st.nextToken());	//시작 숫자
		int N = Integer.parseInt(st.nextToken());	//끝 숫자
		// M과 N사이의 소수들을 오름차순으로 정렬하라.
		
		int[] array = new int[N+1]; 
		for (int i=M; i<=N; i++) {
			for (int j=2; j<i/2; j++) {	//1과 본인 제외하고 나누었을때 안나누어떨어져야 소수
				if (i%j==0) {
					array[i] = 1;	//나누어 떨어진 index에 0이 아닌 숫자 넣기
				}
			}
			if (array[i]==0) { // 1로만 나누어 떨어진 숫자: 소수
				sb.append(i).append("\n");	//StringBuilder에 소수 하나씩 저장
			}
		}
		
		System.out.println(sb);
	}

}
