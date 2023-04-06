package codingTest.utilTest;

import java.io.IOException;

public class InputTest {
	public static void main(String[] args) throws IOException {
        int n = readInt();
        System.out.println(n);
    }

    static int readInt() throws IOException {
        int n = 0;
        boolean isNegative = false;
        while (true) {
            int input = System.in.read();
            if (input <= 32) {
                return isNegative ? n * -1 : n;
            } else if (input == '-')
                isNegative = true;
            else
                n = (n << 3) + (n << 1) + (input & 15);
            System.out.println("input : "+input + " & n :"+n);
        }
    }
}
