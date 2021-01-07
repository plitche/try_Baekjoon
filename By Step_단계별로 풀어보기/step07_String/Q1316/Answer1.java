package step07_String.Q1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class groupChecker {

    boolean setGroupChecker(String a) {
        boolean isGroupChecker = false;
        if (a.length()==1 || a.length()==2) {
            return true;
        }
        for (int i = 0; i < a.length()-1; i++) {
            if (a.charAt(i) != a.charAt(i+1)) {
                for (int j = i + 2; j < a.length(); j++) {
                    if (a.charAt(i) == a.charAt(j)) {
                        isGroupChecker = false;
                        return isGroupChecker;
                    } else {
                        isGroupChecker = true;
                    }
                }
            } else {
                isGroupChecker = true;
            }
        }
        return isGroupChecker;
    }

}

public class Answer1 {

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    groupChecker gc = new groupChecker();

	    int count =0;
	    for (int i=0; i<n; i++) {
	        if (gc.setGroupChecker(br.readLine())) {
	            count++;
	        }
	    }
	        System.out.println(count);

	    }

	}
