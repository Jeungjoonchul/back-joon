package codingTest;

import java.io.*;
import java.util.*;

//진법 변환2(11005번)
//10진수 n과 진법 b 입력
//n을 b진수 형태로 출력
//A = 10, B = 11, ... Z = 35
public class Back11005 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		br.close();
		while(n>0) {
			int mod = n%b;
			if(mod>=10) {
				sb.append((char) ('A' + (mod - 10)));
			}else {
				sb.append(mod);
			}
			n /= b;
		}
		System.out.println(sb.reverse().toString());
	}
}
