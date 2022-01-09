package step07_String.Q1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Answer1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int people = Integer.parseInt(br.readLine());
		String[] withdraw = br.readLine().split(" "); // 각 인원이 출금하는데 필요한 시간 배열에 저장
		
		// 정렬
		Arrays.sort(withdraw);
		
		int totalTime = 0;
		for (int i=0; i<people; i++) {
			totalTime += Integer.parseInt(withdraw[i]);
			if (i != people-1) {
				withdraw[i+1] = String.valueOf(Integer.parseInt(withdraw[i+1]) + Integer.parseInt(withdraw[i]));	
			}
		}
		
		System.out.print(totalTime);
	}

}