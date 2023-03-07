package codingTest;

import java.io.*;

public class IsPalindrome {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String pal = br.readLine();
		
		int len = pal.length();
		boolean result = true;
		for (int i = 0; i < pal.length()/2; i++) {
			if(pal.charAt(i)!=pal.charAt(len-1)) {
				result=false;
				break;
			}
			len--;
		}
		
		System.out.println(result==true?1:0);
		br.close();
	}

}
