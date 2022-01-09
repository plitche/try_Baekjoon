package step03_for.Q8393;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int total = 0;
		while (N!=0) {
			total+=N;
			N--;
		}
		System.out.println(total);
		
	}
	
}