package codingTest;

import java.io.*;

//삼각형 외우기(10101번)
//각 3개 입력 받음
//세 각이 동일 Equilateral 출력
//두 각이 동일 Isosceles 출력
//같은 각 없으면 Scalene 출력
//삼각형 아닌 경우 Error 출력
public class MemorizingTriangle {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] a = new int[3];
		int sum=0;
		for (int i = 0; i < 3; i++) {
			a[i] = Integer.parseInt(br.readLine());
			sum+=a[i];
		}
				
		if(sum==180) {
			if(a[0]==a[1]||a[0]==a[2]||a[1]==a[2]) {
				if(a[0]==a[1]&&a[0]==a[2]) {
					System.out.println("Equilateral");
				}else {
					System.out.println("Isosceles");
				}
			}else {
				System.out.println("Scalene");
			}
		}else {
			System.out.println("Error");
		}
		br.close();	
	}
}
