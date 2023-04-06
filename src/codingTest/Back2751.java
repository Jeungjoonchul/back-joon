package codingTest;

import java.io.*;

public class Back2751 {
	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int cnt = Integer.parseInt(br.readLine());
//		int[] arr = new int[cnt];
//		for (int i = 0; i < cnt; i++) {
//			arr[i]=Integer.parseInt(br.readLine());
//		}
//		br.close();
//		Arrays.sort(arr);
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < arr.length; i++) {
//			sb.append(arr[i]+"\n");
//		}
//		System.out.println(sb);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		boolean[] arr = new boolean[2000001];
		for (int i = 0; i < cnt; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[num+1000000] = true;
		}
		br.close();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == true)
				sb.append(i-1000000).append("\n");
		}
		System.out.println(sb);
	}
}
