package codingTest;

import java.io.*;
import java.util.*;

//세점 주어짐
//직사각형을 충족하는 마지막 점 위치 구하기
//(x, y+b)	(x+a, y+b)
//(x, y)	(x+a, y)
//a = x + x + (x+a) + (x+a)
//a = { x + (x+a) } * 2
//a는 입력 받은 값들을 비교한 후 다르면 더한 후 2배
//구하고자 하는 값은 a - (입력 받은 3개의 값)
public class TheFourthPoint {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int xArr[] = new int[3];
		int yArr[] = new int[3];
        
        //4개 좌표 모두 더한 값
		int a = 0;
		int b = 0;
        
		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			xArr[i]=Integer.parseInt(st.nextToken());
			yArr[i]=Integer.parseInt(st.nextToken());
            
            //2번째 입력 받은 값부터 1번째 입력받은 값과 비교 후 다르면 두 값을 더하여 각각 a,b에 넣기
			if(i>0) {
				a=xArr[i]!=xArr[0]?xArr[i]+xArr[0]:a;
				b=yArr[i]!=yArr[0]?yArr[i]+yArr[0]:b;
			}
		}
		br.close();
        
        //a와 b의 값을 2배로 만들어 준다
		a*=2;
		b*=2;
        
        //a - 입력 받은 3개의 값 = 나머지 좌표
		for (int i = 0; i < 3; i++) {
			a-=xArr[i];b-=yArr[i];
		}
		System.out.println(a+" "+b);
	}
}
