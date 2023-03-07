package codingTest;

import java.io.*;
import java.util.StringTokenizer;

public class ColoredPaper {
	public static void main(String[] args) throws IOException{
		int[][] dp = new int[100][100];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int cnt = Integer.parseInt(br.readLine());
		for (int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for (int j1 = x; j1 < x+10; j1++) {
				for (int j2 = y; j2 < y+10; j2++) {
					if(dp[j1][j2]==0) {
						dp[j1][j2]=1;
					}
				}
			}
		}
		int cp = 0;
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp.length; j++) {
				cp+=dp[i][j];
			}
		}
		System.out.println(cp);
	}
}
