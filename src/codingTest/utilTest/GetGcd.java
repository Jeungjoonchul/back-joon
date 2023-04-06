package codingTest.utilTest;

public class GetGcd {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int result = gcd(a, b);
		System.out.println(result);
	}
	static int gcd(int a, int b) {
		if(b==0)return a;
		return gcd(b,a%b);
	}
}
