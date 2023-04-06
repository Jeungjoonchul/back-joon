package codingTest;

import java.io.*;

public class FirstLetterLastLetter {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < cnt; i++) {
			String str = br.readLine();
			sb.append(str.charAt(0)).append(str.charAt(str.length()-1));
			if(i+1!=cnt) {
				sb.append("\n");
			}
		}
		br.close();
		System.out.println(sb);

	}
}
