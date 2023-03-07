package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CroatiaLetter {
	public static void main(String[] args) throws IOException{
		String[] croatiaLetter = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String word = reader.readLine();
		reader.close();
		int len = 0;
		for (int i = 0; i < croatiaLetter.length; i++) {
			if(word.contains(croatiaLetter[i]))
				word = word.replace(croatiaLetter[i], "!");
		}
		len=word.length();
		System.out.println(len);
	}
}
