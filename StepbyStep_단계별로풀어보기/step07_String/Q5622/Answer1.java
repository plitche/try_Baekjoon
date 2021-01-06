package step07_String.Q5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Dial {

    int setDial(char a) {

        if (a==49){return 1;}
        else if (a==48){return 0;}
        else if (a<68) {return 2;}
        else if (a<71) {return 3;}
        else if (a<74) {return 4;}
        else if (a<77) {return 5;}
        else if (a<80) {return 6;}
        else if (a<84) {return 7;}
        else if (a<87) {return 8;}
        else {return 9;}
    }

}

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String alpha = br.readLine();
        Dial dial = new Dial();

        int totalSecond=0;
        for (int i=0; i<alpha.length(); i++) {
            totalSecond+=dial.setDial(alpha.charAt(i))+1;
        }

        System.out.println(totalSecond);

    }

}