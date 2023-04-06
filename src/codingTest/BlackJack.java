package codingTest;

import java.io.*;
import java.util.*;

//블랙잭(2798번)
//카드 개수 n, 목표점수 m 입력
//카드 n개 입력
//n개의 카드 중 3장의 합이 m에 가까운 경우 찾아 3장의 합 출력
/////////////////////////////////////////////////
//before refactoring
//모든 경우의 수를 구한 후 m과 차이 구한 값을 저장(m - 3장의 합)
//저장된 값을 오름차순 정렬
//정렬된 배열에서 가장 작은 양의 정수 찾기
//m - 찾은 값 출력
/////////////////////////////////////////////////
//after refactoring(맞힌 정답 참고)
//함수 만들어 결과 출력
//카드 3장 뽑기 반복 시행
//뽑은 3장의 합이 m과 동일한 경우 return
//최초 시행 시 결과 값이 m보다 작고 0보다 클 경우 result 변수에 저장 
//이후 시행 시 결과 값이 m보다 작고 result보다 큰 경우 result에 저장
//반복 시행 종료 후 result 값 return
public class BlackJack {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] cards = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < cards.length; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(findCases(cards,n,m));
		
	}
	static int findCases(int[] a,int n, int m) {
		int result=0;
		for (int i = 0; i < n-2; i++) {
			for (int j = i+1; j < n-1; j++) {
				for (int k = j+1; k < n; k++) {
					int tmp = a[i]+a[j]+a[k];
					
					if(tmp==m) {
						return tmp;
					}
					if(result<tmp&&tmp<m) {
						result=tmp;
					}
				}
			}
		}
		return result;
	}
}
