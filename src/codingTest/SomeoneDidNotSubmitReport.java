package codingTest;

import java.io.*;

public class SomeoneDidNotSubmitReport {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] someone = new boolean[30];
		for (int i = 0; i < 28; i++) {
			someone[Integer.parseInt(br.readLine())-1]=true;
		}
		
		for (int i = 0; i < someone.length; i++) {
			if(someone[i]==false) {
				System.out.println(i+1);
			}
		}
		
		br.close();
	}
}
