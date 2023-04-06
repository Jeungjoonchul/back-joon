package codingTest;

import java.io.*;
import java.util.*;

//직사각형에서 탈출
//직사각형 크기 : 좌표평면 w,h
//현재 위치 : x(<w),y(<h)
//x, y, w, h는 정수
//직사각형의 가장 자리로 이동하는 최단거리 구하기
public class EscapeFromRectangle{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		//x,y에서 원점 및 w,h의 거리 구하기 
		int[] d = new int[4];
		int i = 0;
		int min = 1000;
		while(st.hasMoreTokens()) {
			//x,y에서 원점까지 거리
			if(i<2) {
				d[i]=Integer.parseInt(st.nextToken());
			}
			
			//x,y에서 w,h까지
			else {
				d[i]=Integer.parseInt(st.nextToken())-d[i-2];
			}
			//최소값 여부 비교
			if(min>=d[i])min=d[i];
			i++;
		}
		System.out.println(min);
	}
}
