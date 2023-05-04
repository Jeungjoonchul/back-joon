package codingTest;

import java.io.*;
import java.util.*;

public class Back10815 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] nArr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < nArr.length; i++) {
			nArr[i]=Integer.parseInt(st.nextToken());
		}
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		br.close();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			int cnt = 0;
			for (int j = 0; j < nArr.length; j++) {
				if(num == nArr[j]) {
					cnt++;
					break;
				}
			}
			sb.append(cnt).append(' ');
		}
		System.out.println(sb);
	}
}
