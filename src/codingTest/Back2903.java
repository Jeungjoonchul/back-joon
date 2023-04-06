package codingTest;

import java.io.*;

//중앙 이동 알고리즘(2903번)
//s = 점 4개인 정사각형
//1회 시도 시 s * 4가 되며 중복되는 점은 제외 => 점 9개
//2회 시도 시 점9개 * 4 - 중복되는 점 => 25
//점의 개수는 한면에 있는 점의 제곱
//시도가 1회 증가할 때마다 한 면의 점의 개수는 이전 사각형 한면의 점의 개수 * 2 - 1
public class Back2903 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tCase = Integer.parseInt(br.readLine());
		int n = 2;
		for (int i = 0; i < tCase; i++) {
			n=n*2-1;
		}
		System.out.println((int)Math.pow(n, 2));
	}
}
