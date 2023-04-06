package codingTest;

import java.io.*;

public class Rectangle {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int r = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
		br.close();
		bw.write(r+"");
		bw.flush();
		bw.close();
	}
}
