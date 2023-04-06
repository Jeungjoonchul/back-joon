package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//큰 수 A+B
//9223372036854775808는 long 타입 불가
//입력 숫자를 각 자리 별로 더하는 방법 사용
//각 자리의 합이 10이 넘어갈 경우 변수에 저장 후 다음 자리에 추가해줌
public class Back10757 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		
		//1의 자리부터 거꾸로 문자열에 저장(1234 -> 4321)
		StringBuilder a = new StringBuilder(st.nextToken()).reverse();
		StringBuilder b = new StringBuilder(st.nextToken()).reverse();
		
		//자리수를 맞추기 위해 짧은 문자열에 0 추가(a = 54321, b = 321 => b = 32100) 
		int diff = a.length()-b.length();
		while(Math.abs(diff)>0) {
			if(diff>0) {
				b.append("0");
				diff--;
			}else {
				a.append("0");
				diff++;
			}
		}
		
		//i번째 문자를 숫자로 변환후 덧셈
		//10을 넘어가는 경우 다음 자리에 1 더함
		int dec = 0;
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < a.length(); i++) {
			int sum = Integer.parseInt(a.charAt(i)+"")+Integer.parseInt(b.charAt(i)+"")+dec;
			dec = (sum/10);
			result.append(sum%10);
		}
		
		//최고 자리 덧셈이 10을 넘을 경우
		result.append(dec!=0?dec:"");
		System.out.println(result.reverse().toString());
	}
}
