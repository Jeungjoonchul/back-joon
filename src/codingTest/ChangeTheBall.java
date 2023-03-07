package codingTest;

import java.io.*;
import java.util.*;

public class ChangeTheBall {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		for(int a = 0;a<n;a++) {
			arr[a]=a+1;
		}

		for (int b = 0; b < m; b++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());//1
			int j = Integer.parseInt(st.nextToken());//2
			int tmp = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = tmp;
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		br.close();
	}
}
