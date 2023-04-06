package codingTest;

import java.io.*;
import java.util.*;

//삼각형과 세 변(5073번)
//세 변의 길이가 주어짐 (x, y, z)
//가장 긴 변의 길이보다 나머지 두 변 길이의 합이 커야 유효함(x+y>z)
//세 변의 길이가 모두 같으면 Equilateral
//두 변의 길이만 같으면 Isosceles
//모두 길이가 다르면 Scalene
//0 0 0 입력 시 종료
public class TriangleAndThreeSides {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		// 0 0 0 입력 했을 때 종료위한 check
		boolean check = true;
		while (check) {
			check = false;
			int[] sides = new int[3];
			StringTokenizer st = new StringTokenizer(br.readLine());
			// 입력 받은 3개의 값을 배열에 넣고 0이 없는지 확인
			for (int i = 0; i < sides.length; i++) {
				sides[i] = Integer.parseInt(st.nextToken());
				if (sides[i] != 0) {
					check = true;
				}
			}
			// 모두 0일 경우 check=false로 반복문 종료
			if (check == false) {
				break;
			}
			// 배열 오름차순 정렬
			Arrays.sort(sides);

			// 삼각형인 경우
			if (sides[0] + sides[1] > sides[2]) {
				// 세 변 모두 같은 경우
				if (sides[0] == sides[1] && sides[0] == sides[2]) {
					sb.append("Equilateral");
				}
				// 두 변만 같은 경우
				else if (sides[0] == sides[1] || sides[0] == sides[2] || sides[1] == sides[2]) {
					sb.append("Isosceles");
				}
				// 모두 다른 경우
				else {
					sb.append("Scalene");
				}
			}
			// 삼각형 아닌 경우
			else {
				sb.append("Invalid");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
