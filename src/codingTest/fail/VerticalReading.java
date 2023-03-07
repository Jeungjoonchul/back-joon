package codingTest.fail;

import java.io.*;

public class VerticalReading {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] str = new String[5];
		int[] cri = new int[5];
		for (int i = 0; i < 5; i++) {
			str[i] = br.readLine();
			cri[i] = str[i].length();
		}

		boolean check = true;
		while (check) {
			for (int i = 0; i < str.length; i++) {
				if (str[i].length() != 0) {
					char c = str[i].charAt(0);
					str[i] = str[i].substring(1, str[i].length());
					cri[i] = str[i].length();
					sb.append(c);

				}
			}
			
			for (int j = 0; j < str.length; j++) {
				check = false;
				if (str[j].length() != 0) {
					check = true;
				}
			}
		}
		System.out.println(sb);
	}
}
