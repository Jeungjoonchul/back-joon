package codingTest;

public class StringTest {
	public static void main(String[] args) {
		String str = "babac";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.codePointAt(i)-97);
		}
	}
}
