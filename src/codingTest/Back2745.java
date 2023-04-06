package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//진법 변환(2745번)
//10진법 넘으면 A = 11, B = 12, ... Z = 35
//n과 진법 b 입력
//b진법 수 n을 10진법으로
public class Back2745 {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int result = 0;
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        for(int i = n.length()-1; i>=0; i--){
            int index = n.codePointAt(i);
            if(index-48<=9){
                index=index-48;
            }else{
                index = index-55;
            }
            result+=index*(int)Math.pow(b,n.length()-1-i);
        }
        System.out.println(result);
	}
}
