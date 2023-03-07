package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupWord {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int amount = Integer.parseInt(reader.readLine());
		int result = 0;
		for (int i = 0; i < amount; i++) {
			String word = reader.readLine();
			if(isGroupWord(word)) {
				result++;
			}
		}
		System.out.println(result);
		reader.close();
	}
	
	static boolean isGroupWord(String word) {
		String[] arr = new String[26];
		for (int i = 0; i < word.length(); i++) {
			if(arr[word.codePointAt(i)-97]==null) {
				arr[word.codePointAt(i)-97]=word.charAt(i)+"";
			}else {
				if(word.codePointAt(i-1)!=word.codePointAt(i)) {
					return false;
				}
			}
		}
		
		return true;
	}
}
