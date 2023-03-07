package codingTest.fail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACMHotel {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		// 테스트 T
		int T = Integer.parseInt(br.readLine());

		// 호수
		StringBuilder sb = new StringBuilder();
		// 테스트 T회 반복
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken()); // 높이
			int W = Integer.parseInt(st.nextToken()); // 길이
			int N = Integer.parseInt(st.nextToken()); // 번호
			int cri = 0;
			boolean check = true;
			// 호수 찾기
			for (int j = 1; j <= W; j++) {
				if (check) {
					for (int k = 1; k <= H; k++) {
						cri++;
						if (cri == N) {
							check = false;
							if (j < 9) {
								sb.append(k + "" + "0" + j);
							} else {
								sb.append(k + "" + j);
							}
							break;
						}
					}
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
