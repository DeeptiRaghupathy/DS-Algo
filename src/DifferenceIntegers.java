import java.io.IOException;
import java.util.Scanner;

public class DifferenceIntegers {
    public static void main(String[] args) throws IOException {
    	Scanner input = new Scanner(System.in);
	        while (input.hasNextLong()) {
	        	System.out.println("hello");
	            long num1 = input.nextLong();
	            long num2 = input.nextLong();
	            long diff = num2 - num1;
	            System.out.println(Math.abs(diff));
	        }
	     input.close();
    }

}
