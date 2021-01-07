package step07_String.Q2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String alpha = br.readLine();
        String[] a = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        int count=alpha.length();
        for(int i=0; i<a.length; i++){
            int n=0;
            while(alpha.indexOf(a[i], n)!=-1) {
                n=alpha.indexOf(a[i], n)+1;
                count--;
            }
        }
        System.out.println(count);

    }

}