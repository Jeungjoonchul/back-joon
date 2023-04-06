package codingTest.utilTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HH:mm");
		String now = sdf.format(new Date());
		System.out.println(now);
	}
}
