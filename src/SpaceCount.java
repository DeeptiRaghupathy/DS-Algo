import java.io.IOException;
import java.util.Scanner;

//import com.sun.tools.javac.util.StringUtils;


public class SpaceCount {
	 
	static void staircase(int n) {
    	
		int spaceCount = n;
	     for(int i=1;i<=n;i++) {
	         //for(int j=1;j<=i;j++) {
	             //System.out.printf("%1$"+spaceCount+"s", StringUtils.repeat("#", i));  
	         //}
	         spaceCount--;
	         //System.out.println();
	     }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        staircase(6);

    }
}
