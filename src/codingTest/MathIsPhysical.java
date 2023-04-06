package codingTest;

import java.io.*;

//수학은 체육과목 입니다(15894번)
//한변의 길이가 1인 정사각형을 겹치지않게 붙여 나감(피라미드 형식)
//줄 수 n이 주어지고 가장 마지막줄에 정사각형 n개가 붙여짐
//둘레 길이 구하기
//n -> 3n+n
public class MathIsPhysical {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(Long.parseLong(br.readLine())*4);
		br.close();
	}
}
