package codingTest;

import java.io.*;
import java.util.StringTokenizer;

public class ChangeBasketOrder {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] basket = new int[Integer.parseInt(st.nextToken())+1];
		int[] tmp = new int[basket.length];
		int tc = Integer.parseInt(st.nextToken());
		for (int i = 1; i < basket.length; i++) {
			basket[i]=i;
		}
	
		for (int i = 0; i < tc; i++) {
			st=new StringTokenizer(br.readLine());
			int begin = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int mid=Integer.parseInt(st.nextToken());
			
			for (int j = 0; j < end-mid+1; j++) {
				tmp[j+begin]=basket[mid+j];
			}
			
			for (int j = 0; j < mid-begin; j++) {
				tmp[j+1+begin+end-mid]=basket[begin+j];
			}
			
			for (int j = begin; j <= end; j++) {
				basket[j] = tmp[j];
			}
		}
		for (int i = 1; i < tmp.length; i++) {
			System.out.print(basket[i]+" ");
		}
	}
}
