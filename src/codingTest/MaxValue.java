package codingTest;

import java.io.*;
import java.util.StringTokenizer;

public class MaxValue {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		String row_col="";
		for (int i = 1; i <= 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= 9; j++) {
				int val =Integer.parseInt(st.nextToken()); 
				if(val>=max) {
					max = val;
					row_col=(i)+" "+(j);
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(max).append('\n').append(row_col);
		System.out.println(sb.toString());
	}
}
