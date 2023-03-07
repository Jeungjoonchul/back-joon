package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreakEvenPoint {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int f = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		if(v>=p) {
			System.out.println(-1);
		}else {
			System.out.println((f/(p-v))+1);
		}
	}
}
