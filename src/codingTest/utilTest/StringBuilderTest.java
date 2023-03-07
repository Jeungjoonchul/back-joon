package codingTest.utilTest;

public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			sb.append(i).append(" +").append("\n");
		}
		System.out.println(sb);
		boolean[] s = new boolean[2];
		System.out.println(s[0]);
		System.out.println(s[1]);
	}
}
