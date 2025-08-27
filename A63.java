import java.util.*;

public class A63{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lineNumber = 1;

        // Keep reading until EOF
        while (input.hasNext()) {
            String line = input.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }
    }
}
