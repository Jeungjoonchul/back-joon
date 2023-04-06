package codingTest;

import java.io.*;

//분해합(2231번)
//주어진 자연수 n과 n의 각 자리 수를 모두 더한 값 = m
//m의 생성자는 n
//m이 주어졌을 때 가장 작은 생성자 n 구하기
public class Back2231 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		int result=0;
		for (int i = n-1; i > 0; i--) {
			int sum = i;
			String[] arr = (i+"").split("");
			for (int j = 0; j < arr.length; j++) {
				sum+=Integer.parseInt(arr[j]);
			}
			if(sum==n) {
				result = i;
			}
		}
		System.out.println(result);
	}
}
