package step06_function.Q4673;

import java.util.Arrays;

public class Answer1 {
	public static void main(String[] args) {
	    int[] a = new int[10000];
	    int[] b = new int[10000];

	    for (int i=0; i<a.length; i++) {
	        a[i] = i+1;
            if (a[i]<10) {
                b[i] = a[i] + a[i];
            } else if (a[i]<100) {
                b[i] += a[i];
                b[i] += a[i]/10;
                b[i] += a[i]%10;
            } else if (a[i]<1000) {
                b[i] += a[i];
                b[i] += a[i]/100;
                b[i] += (a[i]-((a[i]/100)*100))/10;
                b[i] += a[i]%10;
            } else if (a[i] < 10000) {
                b[i] += a[i];
                b[i] += a[i]/1000;
                b[i] += (a[i]-((a[i]/1000)*1000))/100;
                b[i] += (a[i]-((a[i]/100)*100))/10;
                b[i] += a[i]%10;
            } else {
                b[i] = 2;
            }
        }

        for (int i=0; i<a.length; i++) {
            for (int j=0; j<b.length; j++) {
                if (a[i] == b[j]) {
                    a[i] = 0;
                }
            }
        }
        Arrays.sort(a);
	    int[] result = new int[983];

        for(int i=0; i< result.length; i++) {
            result[i] = a[i+9017];
            System.out.println(result[i]);
        }

    }
}
