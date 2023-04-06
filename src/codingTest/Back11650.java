package codingTest;

import java.io.*;
import java.util.*;

public class Back11650 {
	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		int[][] p = new int[n][2];
//		for (int i = 0; i < n; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			p[i][0] = Integer.parseInt(st.nextToken());
//			p[i][1] = Integer.parseInt(st.nextToken());
//		}
//		br.close();
//		for (int i = 0; i < p.length; i++) {
//			for (int j = 0; j < p.length - 1; j++) {
//				int[] tmp = p[j];
//				if (p[j][0] >= p[j + 1][0]) {
//					if (p[j][0] == p[j + 1][0]) {
//						if (p[j][1] > p[j + 1][1]) {
//							p[j] = p[j + 1];
//							p[j + 1] = tmp;
//						}
//					} else {
//						p[j] = p[j + 1];
//						p[j + 1] = tmp;
//					}
//				}
//			}
//		}
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < p.length; i++) {
//			sb.append(p[i][0]).append(' ').append(p[i][1]).append('\n');
//		}
//		System.out.println(sb.toString());
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] p = new int[n][2];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			p[i][0] = Integer.parseInt(st.nextToken());
			p[i][1] = Integer.parseInt(st.nextToken());
		}
		
		br.close();
	}
	static void quickSort(int[] data, int start, int end) {
		if(start>=end) {
			return;
		}
		
		int pivot = start;
		int i = pivot;
		int j = end;
		int tmp;
		
		while(i<=j) {
			while(i<= end && data[i]<=data[pivot]) {
				i++;
			}while(j>start && data[j]>=data[pivot]) {
				j--;
			}
			
			if(i>j) {
				tmp = data[j];
				data[j]=data[pivot];
				data[pivot]=tmp;
			}else {
				tmp = data[i];
				data[i]=data[j];
				data[j]=tmp;
			}
		}
		
		quickSort(data, start, j-1);
		quickSort(data,j+1,end);
	}
}
