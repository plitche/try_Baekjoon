/* 
	작성자: 권용수
	이메일: kysu728@naver.com
	주소: 서울시 마포구
	GitHub: https://github.com/plitche/try_Baekjoon
*/

package step09_math2.Q2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wrong1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());	//시작 숫자
		int N = Integer.parseInt(br.readLine());	//끝 숫자
		// M과 N사이의 소수들의 합과, 그 소수들 중 가장 작은 수를 출력 하라.
		// M과 N사이에 소수가 없다면, -1을 출력하라.
		
		int[] array = new int[N+1]; 
		int total = 0;	//합계를 구해 줄 변수 생성
		for (int i=M; i<=N; i++) {
			for (int j=1; j<i; j++) {	//1로만 나누어 떨어지는 숫자: 소수
				if (i%j==0) {
					array[i] += 1;	//나누어 떨어진 index에 0이 아닌 숫자 넣기
				}
			}
		}
		
		int min = 10001;	//M과 N은 10000보다 낮은 숫자라고 조건이 있음으로 10001로 설정
		for (int i=M; i<=N; i++) {
			if (array[i]==1) { // 1로만 나누어 떨어진 숫자: 소수
				total+=i;	//index:소수
				if(min>i) {
					min = i;
				}
			}
		}
		
		if(total == 0) {	//소수가 하나도 없어서 total이 그대로 0이라면
			System.out.println(-1);
		} else {	//소수가 1개라도 존재했다면
			System.out.println(total);
			System.out.println(min);
		}
		
	}

}
