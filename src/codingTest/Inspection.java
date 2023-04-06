package codingTest;

import java.io.*;
import java.util.Arrays;

public class Inspection {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i]=Integer.parseInt(br.readLine());
		}
		br.close();
		Arrays.sort(numbers);
		
		int a = numbers[1]-numbers[0];
		for (int i = 1; i < n; i++) {
			a=getGcd(a,numbers[i]-numbers[i-1]);
		}
		
		for (int i = 2; i <= a; i++) {
			if(a%i==0)sb.append(i).append(" ");
		}
		System.out.println(sb.toString());
	}
	static int getGcd(int a, int b) {
		if(b==0)return a;
		return getGcd(b,a%b);
	}
}
