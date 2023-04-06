package codingTest.utilTest;

import java.util.Arrays;

public class FunctionTest {
	public static void main(String[] args) {
		String[][] a = new String[8][8];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j]="W";
			}
		}
		test(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}
	static void test(String[][] a) {
		String b[][]=a;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				b[i][j]="B";
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}
}
