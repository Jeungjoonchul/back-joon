package codingTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		Random r = new Random();
		Map<String,Integer> numbers = new HashMap<>();
		for (int i = 1; i <= 45; i++) {
			numbers.put(i+"", 0);
		}
		int[] lotto = new int[6];
		for (int i = 0; i < 9000000; i++) {
			for (int j = 0; j < 6;) {
				int a = r.nextInt(45) + 1;
				boolean isDup = false;
				for (int k = 0; k < lotto.length; k++) {
					if(lotto[k]!=a) {
						isDup = false;
					}else {
						isDup = true;
					}
				}
				if(isDup) {
					continue;
				}else {
					lotto[j]=a;
					int before=numbers.get(a+"");
					numbers.put(a+"", before+1);
					j++;
				}
			}
		}
		List<String> keySet = new ArrayList<>(numbers.keySet());
		keySet.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return numbers.get(o2).compareTo(numbers.get(o1));
			}
		});
		int top6=1;
		for (String key : keySet) {
			System.out.print(key+" : ");
			System.out.println(numbers.get(key));
			if(top6==6) {
				break;
			}
			top6++;
		}
	}
}
