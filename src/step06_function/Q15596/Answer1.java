package step06_function.Q15596;

import java.util.Scanner;

public class Answer1 {
	long sum(int[] a) {
        long ans = 0;
        for (int i=0; i<a.length; i++) {
        	ans += a[i];
        }
        
        return ans;
    }
    
	public static void main(String[] args) {

		Answer1 t = new Answer1();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println(t.sum(a));
		
		sc.close();
	}
}