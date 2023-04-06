package codingTest;

import java.io.*;

public class Back10989 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] cnt = new int[10001];
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			cnt[Integer.parseInt(br.readLine())]++;
		}
		br.close();
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < cnt.length; i++) {
			while(cnt[i]>0) {
				sb.append(i+"\n");
				cnt[i]--;
			}
		}
		System.out.println(sb);
	}
}
