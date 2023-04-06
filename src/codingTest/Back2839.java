package codingTest;

import java.io.*;

//설탕 배달(2839번)
//설탕 무게n(kg)입력됨
//n을 3kg 봉지와 5kg 봉지로 나눠 담았을 때 봉지 최소값 구하기
//반드시 봉지에 해당하는 무게로 담아야하며 설탕이 남는 경우 -1 출력
//전체 탐색 시행
public class Back2839 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		int[][] t = {{3,5},{5,3}};
		int r = 5001;
		for (int i = 0; i < t.length; i++) {
			for (int j = 1; j <= n/t[i][0]; j++) {
				int remainder = n-(j*t[i][0]);
				if(remainder%t[i][1]==0) {
					r=(j+(remainder/t[i][1]))<=r?(j+(remainder/t[i][1])):r;
				}
			}
		}
		System.out.println(r==5001?-1:r);
	}
}
