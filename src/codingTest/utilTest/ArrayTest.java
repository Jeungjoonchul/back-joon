package codingTest.utilTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayTest {
	public static void main(String[] args) {
		Object[] arr = new Object[3];
		for (int i = 0; i < arr.length; i++) {
			int[] a = {1,3};
			arr[i]= a;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString((int[]) arr[i]));
		}
	}
}
