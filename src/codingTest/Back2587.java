package codingTest;

import java.io.*;
import java.util.Arrays;

public class Back2587 {
	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int sum = 0;
//		int[] arr = new int[5];
//		for (int i = 0; i < 5; i++) {
//			arr[i]=Integer.parseInt(br.readLine());
//			sum+=arr[i];
//		}
//		Arrays.sort(arr);
//		System.out.println(sum/5);
//		System.out.println(arr[(int)Math.ceil(arr.length/2)]);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[5];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Integer.parseInt(br.readLine());
			sum+=arr[i];
		}
		br.close();
		sort(arr);
		StringBuilder sb = new StringBuilder();
		sb.append((int)sum/5).append("\n").append(arr[2]);
		System.out.println(sb);
		
	}
	static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				int tmp;
				if(arr[j]>arr[j+1]) {
					tmp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
	}
}
