package codingTest;

import java.io.*;
import java.util.Arrays;

public class Back2750 {
	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int NoN = Integer.parseInt(br.readLine());
//		int[] arr = new int[NoN];
//		for (int i = 0; i < NoN; i++) {
//			arr[i]=Integer.parseInt(br.readLine());
//		}
//		br.close();
//		Arrays.sort(arr);
//		for (int i = 0; i < NoN; i++) {
//			System.out.println(arr[i]);
//		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int[] arr = new int[cnt];
				
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length-1; j++) {
//				int tmp;
//				if(arr[j]>arr[j+1]) {
//					tmp = arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=tmp;
//				}
//			}
//		}
		quickSort(arr,0,cnt-1);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]+"\n");
		}
		System.out.println(sb);
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
