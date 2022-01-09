package step05_oneDimensionalArray.Q10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Answer1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String[] arr = str.split(" ");
		
		int[] array = new int[N];
		for (int i=0; i<arr.length; i++) {
			array[i] = Integer.parseInt(arr[i]);
		}
		
		Arrays.sort(array);
		System.out.print(array[0] + " ");
		System.out.println(array[N-1]);
		
	}

}