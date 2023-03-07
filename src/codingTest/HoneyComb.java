package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HoneyComb {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());
		int level = 1;
		if(num == 1) {
			System.out.println(1);
		}
		while(num>3*level*(level-1)+1) {
			if(num<=3*(level+1)*(level)+1) {
				System.out.println(level+1);
			}
			level++;
		}
		reader.close();
	}
}
