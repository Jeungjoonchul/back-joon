package codingTest;

import java.io.*;

public class PrimeNumbers {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		br.close();
		int sum = 0;
		int min = n;
		for (int i = m; i <= n; i++) {
			if(isPrime(i)) {
				sum+=i;
				min=min>i?i:min;
			}
		}
		
		sb.append(sum).append("\n").append(min);
		if(sum==0) {
			System.out.println(-1);
		}else {
			System.out.println(sb.toString());
		}
		
	}
	static boolean isPrime(int num) {
		if(num<=1) return false;
		for (int i = 2; i < num; i++) {
			if(num%i==0)return false;
		}
		return true;
	}
}
