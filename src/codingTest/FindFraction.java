package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindFraction {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int seq = Integer.parseInt(reader.readLine());
		int level = 1;
		boolean b = true;
		int x = 0;
		int y = 0;
		while(b) {
			int min = level*(level-1)/2+1;
			int max = level*(level+1)/2;
			if(min<=seq && seq<=max) {
				if(level%2==0) {
					y=level+1;
					for (int i = min; i <= seq; i++) {
						x++;
						y--;			
					}
				}else {
					x=level+1;
					for (int i = min; i <= seq; i++) {
						x--;
						y++;
					}
				}
				System.out.println(x+"/"+y);
				b=false;
			}
			level++;
		}
		reader.close();
	}
}
