package codingTest;

import java.io.*;
import java.util.*;

public class Back25305 {
	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int len = Integer.parseInt(st.nextToken());
//		int index = Integer.parseInt(st.nextToken());
//		Integer[] arr = new Integer[len];
//		st=new StringTokenizer(br.readLine());
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=Integer.parseInt(st.nextToken());
//		}
//		Arrays.sort(arr,Collections.reverseOrder());
//		System.out.println(arr[index-1]);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int len = Integer.parseInt(st.nextToken());
		int index = Integer.parseInt(st.nextToken());
		int[] arr = new int[len];
		st=new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		sort(arr);
		System.out.println(arr[index-1]);
	}
	static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				int tmp;
				if(arr[j]<arr[j+1]) {
					tmp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
	}
}
