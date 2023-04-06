package codingTest;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test{

	public static void main(String[] args) {
		boolean b = true;
		try {
			while(b) {
				LocalTime now = LocalTime.now();
				if(now.getHour()==15&&now.getMinute()==10) {
					b=false;
				}
				Thread.sleep(999);
			}
		} catch (InterruptedException e) {

		}
		HashMap<String,Integer> lottoMap = new HashMap<>();

		for (int i = 0; i < 10000000; i++) {
			int number = (int)(Math.random()*45+1);
			if(lottoMap.get(number+"")==null) {
				lottoMap.put(number+"", 1);
			}else {
				int cnt=lottoMap.get(number+"");
				cnt++;
				lottoMap.put(number+"", cnt);	
			}
			
		}

		List<Map.Entry<String, Integer>> entryList = new LinkedList<>(lottoMap.entrySet());
		entryList.sort(Map.Entry.comparingByValue());
		for (Map.Entry<String, Integer> entry : entryList) {
			System.out.println("number : "+entry.getKey()+"	/ cnt : "+entry.getValue());
		}
	}
}