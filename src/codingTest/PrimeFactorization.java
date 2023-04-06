package codingTest;

import java.io.*;

public class PrimeFactorization {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int pn = 2;

		br.close();
		StringBuilder sb = new StringBuilder();

		while (n > 1) {
			if (n % pn == 0) {
				n = n / pn;
				sb.append(pn).append("\n");
			} else {
				pn++;
			}
		}
		System.out.println(sb.toString());

	}
}
