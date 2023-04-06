package codingTest;

import java.io.*;

public class Back1427 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split("");
		br.close();
		StringBuilder sb = new StringBuilder();
		for (int i = 9; i >=0; i--) {
			for (int j = 0; j < arr.length; j++) {
				if(i-Integer.parseInt(arr[j])==0) {
					sb.append(arr[j]);
				}
			}
		}
		System.out.println(sb);
	}
}
