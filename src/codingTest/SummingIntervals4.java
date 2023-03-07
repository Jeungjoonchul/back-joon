package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SummingIntervals4 {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int num = Integer.parseInt(st.nextToken());
		int cnt = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[num];
		reader=new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(reader.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		
		reader = new BufferedReader(new InputStreamReader(System.in));
		String[] a = new String[cnt];
		int[] sum = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			a[i]=reader.readLine();
		}
		
		for (int i = 0; i < cnt; i++) {
			int start = Integer.parseInt(a[i].split(" ")[0])-1;
			int end = Integer.parseInt(a[i].split(" ")[1]);
			for (int j = start; j < end; j++) {
				sum[i]+=arr[j];
			}
			System.out.println(sum[i]);
		}
		reader.close();
	}
}
