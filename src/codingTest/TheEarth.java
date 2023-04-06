package codingTest;

import java.io.*;
import java.util.*;

//대지(9063번)
//옥구슬 위치 N개 주어짐
//N개의 좌표 주어짐
//N개의 좌표를 모두 포함하는 최대 크기의 직사각형 넓이 구하기
//(x좌표의 최대값 - 최소값) * (y좌표의 최대값 - 최소값)
public class TheEarth {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int xMin=10000;
		int xMax=-10000;
		int yMin=10000;
		int yMax=-10000;
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			xMin=Math.min(xMin, x);
			xMax=Math.max(xMax, x);
			yMin=Math.min(yMin, y);
			yMax=Math.max(yMax, y);
		}
		br.close();
		System.out.println((xMax-xMin)*(yMax-yMin));
	}
}
