package codingTest;

import java.io.*;

public class VerticalReading {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[][] letters = new char[5][15];
		
		for (int i = 0; i < letters.length; i++) {
			String str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				letters[i][j]=str.charAt(j);
			}
		}
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if(letters[j][i]!='\0') {
					sb.append(letters[j][i]);
				}
			}
		}
		System.out.println(sb);
	}
}
