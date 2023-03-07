package codingTest;

import java.io.*;

public class CodingIsPhysicalEducation {
	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		int b = n/4;
		String result ="int";
		for (int i = 0; i < b; i++) {
			result = "long "+result;
		}
		System.out.println(result);
	}
}
