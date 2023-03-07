package codingTest;

import java.io.*;
import java.util.StringTokenizer;

public class MatrixAddition {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());
		int[][] m1 = new int[row][col];
		int[][] m2 = new int[row][col];
		for (int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < col; j++) {
				m1[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < col; j++) {
				m2[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		br.close();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				sb.append(m1[i][j]+m2[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
