package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACMHotel {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int testCases = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCases; i++) {
			st=new StringTokenizer(br.readLine());
			int height = Integer.parseInt(st.nextToken());
			int width = Integer.parseInt(st.nextToken());
			int number = Integer.parseInt(st.nextToken());
			sb.append(findRoomNumber(height, width, number)).append("\n");
		}
		System.out.println(sb.toString());
	}
	private static String findRoomNumber(int height, int width, int number) {
		// 층수 구하기
		int floor = number%height;
		if(floor==0) {
			floor = height;
		}
		
		// 호수 구하기
		int roomNumber = (int)Math.ceil((double)number/height);
		
		StringBuilder sb = new StringBuilder();
		sb.append(floor);
		if(roomNumber<10) {
			sb.append("0");
		}
		sb.append(roomNumber);
		
		
		return sb.toString();
	}
}
