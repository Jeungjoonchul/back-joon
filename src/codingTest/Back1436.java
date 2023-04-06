package codingTest;

import java.io.*;

//영화감독 숌(1436번)
public class Back1436 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int series_number = 666;

		while (N > 0) {
			if (Integer.toString(series_number).contains("666")) {
				N--;
			}
			series_number++;
		}
		System.out.println(series_number - 1);
	}
}
