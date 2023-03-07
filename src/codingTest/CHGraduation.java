package codingTest;

import java.io.*;

public class CHGraduation {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double totalS=0;
		double subject=0;
		for (int i = 0; i < 20; i++) {
			String str = br.readLine();
			double sub = Double.parseDouble(str.split(" ")[1]);
			subject+=sub;
			switch(str.split(" ")[2]) {
			case "A+":
				totalS+=sub*4.5;
				break;
			case "A0":
				totalS+=sub*4.0;
				break;
			case "B+":
				totalS+=sub*3.5;
				break;
			case "B0":
				totalS+=sub*3.0;
				break;
			case "C+":
				totalS+=sub*2.5;
				break;
			case "C0":
				totalS+=sub*2.0;
				break;
			case "D+":
				totalS+=sub*1.5;
				break;
			case "D0":
				totalS+=sub*1.0;
				break;
			case "F":
				totalS+=0;
				break;
			default:
				subject-=sub;
				break;
			}
		}
		System.out.printf("%.6f", totalS/subject);
		br.close();
	}
}