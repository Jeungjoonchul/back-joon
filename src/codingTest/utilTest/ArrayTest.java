package codingTest.utilTest;

public class ArrayTest {
	public static void main(String[] args) {
		int[] m1 = {1,2,3};
		int[] m2 = {4,5,6};
		Object[] o = {m1,m2};
		System.out.println(((int[])o[1])[2]);
	}
}
