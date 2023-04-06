package codingTest;

import java.io.*;
import java.util.*;

//세 막대(14215번)
//길이가 a, b, c인 세 막대 주어짐
//막대의 길이는 마음대로 줄일 수 있음
//c가 가장 긴 막대인 경우 다음의 조건을 만족해야함
//a + b > c
public class ThreeSticks {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] s = new int[3];
		int sum = 0;
		for (int i = 0; i < s.length; i++) {
			s[i]=Integer.parseInt(st.nextToken());
			sum+=s[i];
		}
		int max = Math.max(s[2], Math.max(s[0], s[1]));
		int two = sum-max;
		while(true) {
			if(two<=max) {
				max--;
			}else {
				break;
			}
		}
		System.out.println(two+max);
	}
}
