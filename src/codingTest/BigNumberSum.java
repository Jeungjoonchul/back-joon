package codingTest;

import java.io.*;
import java.util.StringTokenizer;

public class BigNumberSum {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[][] numbers = new int[3][];
		for (int i = 1; i <3; i++) {
			String integer = st.nextToken();
			for (int j = 0; j < integer.length(); j++) {
				numbers[i][j]=(int)integer.charAt(j);
			}
		}
	}
}
