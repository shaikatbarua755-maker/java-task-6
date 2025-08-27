import java.util.Scanner;

public class A60 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();  // Read the input number

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }
    }
}

