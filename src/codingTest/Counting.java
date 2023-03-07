package codingTest;

import java.io.*;
import java.util.*;

public class Counting {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i<arr.length;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int v = Integer.parseInt(br.readLine());
		int result=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==v) {
				result++;
			}
		}
		System.out.println(result);
		br.close();
	}
}
