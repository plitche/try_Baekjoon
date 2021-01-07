/* 
	작성자: 권용수
	이메일: kysu728@naver.com / kysu728@gmail.com
	주소: 서울시 마포구 노고산동
	GitHub: https://github.com/plitche/try_Baekjoon
*/

package q1000_q1099.q1001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Answer1_88ms {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.println(A-B);

    }

}