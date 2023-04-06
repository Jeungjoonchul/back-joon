package codingTest;

import java.io.*;

public class RunningTimeOfAlgorithm{
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        System.out.println((n-2)*(n-1)*n/6+"\n3");
        br.close();
    }
}