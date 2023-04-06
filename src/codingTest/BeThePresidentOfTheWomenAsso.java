package codingTest;

import java.io.*;

public class BeThePresidentOfTheWomenAsso {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		//Test case T
		int testCases=Integer.parseInt(br.readLine());
		
		//T번 반복
		for (int i = 0; i < testCases; i++) {
			int floor=Integer.parseInt(br.readLine());
			int roomNumber=Integer.parseInt(br.readLine());
			int[][] apt = new int[floor+1][roomNumber+1];
			
			for (int j = 1; j < apt[0].length; j++) {
				apt[0][j]=j;
			}
			
			for (int j1 = 1; j1 <= floor; j1++) {
				for (int j2 = 1; j2 <= roomNumber; j2++) {
					int val = 0;
					for (int j = 1; j <= j2; j++) {
						val+=apt[j1-1][j];
					}
					apt[j1][j2]=val;
				}
			}
			sb.append(apt[floor][roomNumber]).append("\n");
		}
		System.out.println(sb.toString());
	}
}
