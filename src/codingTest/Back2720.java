package codingTest;

import java.io.*;

//세탁소 사장 동력(2720번)
//거스름돈 계산 문제
//거스름돈 n센트에 대해
//25센트 동전, 10센트 동전, 5센트 동전, 1센트 동전 몇개씩 줘야 하나?
//테스트 횟수 t입력 및 테이스트 케이스 t개 한줄씩 입력
//ex)
//11 -> 0 1 0 1(O) / 0 0 2 1(X) / 0 0 0 10(X)
//69 -> 2 1 1 4(O) / 1 4 0 4(X) / 2 0 3 4(X)
public class Back2720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < testCase; i++) {
			int c = Integer.parseInt(br.readLine());
			int[] coins = { 25, 10, 5, 1 };
			for (int j = 0; j < coins.length; j++) {
				int q = c / coins[j];
				c = c % coins[j];
				sb.append(q+" ");
			}
			sb.append("\n");
		}
		br.close();
		System.out.println(sb.toString());
	}
}
