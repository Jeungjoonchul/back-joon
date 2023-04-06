package codingTest;

import java.io.*;
import java.util.*;
//체스판 다시 칠하기(1018번)
//크기가 n*m인 보드 입력
//보드 한 칸의 색상은 흰색(W) 또는 검정색(B)
//보드 중 8*8만 잘라 체스판 만들기
//보드 한 칸의 색상을 최소한으로 변경하는 방법으로 체스판 완성

//입력받은 보드 중 어디를 잘라야 할 것인가?
//입력받은 보드를 [8,8]로 자를 수 있는 상황 모두 고려
//[8,8]로 자른 보드를 [0,0]기준으로 보드 변경 횟수 구함
//[8,8]로 자른 보드의 [0,0]값을 바꾼 후 보드 변경 횟수 구함
//모든 경우의 수에서 가장 낮은 값 출력
public class Back1018 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//입력 받을 보드의 크기
		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());
		String[][] bo = new String[row][col];
		
		//보드의 구성(무작위의 B 또는 W)
		for (int i = 0; i < bo.length; i++) {
			bo[i] = br.readLine().split("");
		}
		
		//보드를 변경한 횟수 기준
		int result = 64;
		
		//보드 [8,8]로 자르고 체스판 만들기 시행
		for (int r = 0; r <= bo.length - 8; r++) {
			
			//보드 자르기
			String[][] bc = new String[8][8];
			for (int c = 0; c <= bo[r].length - 8; c++) {
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						bc[i][j] = bo[r + i][c + j];
					}
				}
				
				//자른 보드로 변경 횟수 구하기([0,0]이 W인 경우와 B인 경우 2번)
				for (int i = 0; i < 2; i++) {
					
					//함수로 전달하기 위한 새로운 배열 선언(새로 선언하지 않고 위에서 자른 bc를 넘길 경우 함수에서 주소값 참조되어 bc도 변경됨)
					String[][] b=new String[8][8];
					for (int j = 0; j < b.length; j++) {
						for (int k = 0; k < b[i].length; k++) {
							b[j][k]=bc[j][k];
						}
					}
					
					//[0,0] 값 변경
					if(i==1) {
						b[0][0]=reverse(b[0][0]);
					}
					
					int cnt = changeRoomCnt(b);//변경 횟수 함수 이용
					cnt=i==1?(cnt+1):cnt;//[0,0]값 변경한 경우 변경 횟수 1 증가
					result = cnt<=result?cnt:result;//값 비교 후 작은 값 사용
				}
			}
		}
		System.out.println(result);
	}

	static int changeRoomCnt(String[][] bo) {
		int cnt = 0;

		String cri = bo[0][0];//비교를 위한 기준 값
		for (int i = 0; i < bo.length; i++) {
			for (int j = 0; j < bo.length; j++) {
				String tmp = bo[i][j];
				if (!tmp.equals(cri)) {
					bo[i][j] = reverse(tmp);
					cnt++;
				}
				cri = reverse(cri);//옆 칸으로 이동 시 기준 값 뒤집기
			}
			cri = reverse(cri);//줄 바꿈 시 기준 값 뒤집기
		}
		return cnt;
	}

	//값 변경 함수
	static String reverse(String s) {
		return s.equals("W") ? "B" : "W";
	}
}
