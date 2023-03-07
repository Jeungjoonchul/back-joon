package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ClimbingSnail {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int c = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int day = (h-s)/(c-s);
		if((h-s)%(c-s)!=0) {
			day++;
		}
		System.out.println(day);
		reader.close();
	}
}
