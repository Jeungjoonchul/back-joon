package codingTest;

import java.io.*;

public class BeThePresidentOfTheWomenAsso {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[][] m;
		for (int i = 0; i < cnt; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			m=new int[k+1][n]; // m = new int[3][3]
			for (int j = 0; j < m[0].length; j++) {
				m[0][j]=j+1;
			}
			for (int j1 = 1; j1 < m.length; j1++) {
				for (int j2 = 0; j2 < m[j1].length; j2++) {
					int prevLine = j1-1;
					for (int j = 0; j < m[prevLine].length; j++) {
						System.out.println(m[prevLine][j]);
						m[j1][j2]+=m[prevLine][j];
					}
				}
			}
			
			for (int j = 0; j < m.length; j++) {
				for (int j2 = 0; j2 < m.length; j2++) {
					System.out.print(m[j][j2]+" ");
				}
				System.out.println();
			}
			sb.append(m[k][n-1]).append("\n");
		}
		System.out.println(sb);
	}
}
