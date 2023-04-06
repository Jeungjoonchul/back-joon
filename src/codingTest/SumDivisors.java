package codingTest;

import java.io.*;

public class SumDivisors {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n==-1) {
				break;
			}
			int divSum = 0;
			String result = n+" = ";
			for (int i = 1; i < n; i++) {
				if(n%i==0) {
					divSum+=i;
					result=result+i+" + ";
				}
			}
			result = result.substring(0,result.length()-3);
			if(n==divSum) {
				System.out.println(result);
			}else {
				System.out.println(n+ " is NOT perfect.");
			}
			
		}
		br.close();
	}
}
