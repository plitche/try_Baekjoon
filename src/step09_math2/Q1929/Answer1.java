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
		
		boolean[] primeNo = new boolean[N+1];	//소수가 아닌 숫자들을 true로 바꾸기 
		primeNo[0] = true;
		primeNo[1] = true;
		
		for (int i=2; i<N/2; i++) {	// 소인수분해시 2가 가장 낮은 숫자임으로 N/2까지만 하면된다.
			if (primeNo[i]==false) {
				for (int j=i+i; j<=N; j=j+i) { // i의 배수들은 전부 소수가 아니다.
					primeNo[j] = true;
				}
			}
		}

		for (int i=M; i<=N; i++) {
			if (primeNo[i]==false) {
				sb.append(i).append("\n");
			}
		}
		
		System.out.println(sb);
	}

}
