package codingTest;

import java.io.*;
import java.util.StringTokenizer;

public class KidJeongMin {
	public static void main(String[] args) throws IOException{
		StringTokenizer token = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
		long result=0;
		while(token.hasMoreTokens()) {
			result+=Long.parseLong(token.nextToken());
		}
		System.out.println(result);
	}
}
