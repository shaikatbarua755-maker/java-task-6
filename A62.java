import java.util.*;
import java.io.*;

class A62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt(); // number of test cases

        for (int i = 0; i < t; i++) {
            try {
                long n = input.nextLong(); // try to read as long

                System.out.println(n + " can be fitted in:");

                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE)
                    System.out.println("* short");
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
                    System.out.println("* int");
                // always true if it fits in long
                System.out.println("* long");

            } catch (Exception e) {
                // If input is too big for a long
                String s = input.next(); 
                System.out.println(s + " can't be fitted anywhere.");
            }
        }
    }
}
