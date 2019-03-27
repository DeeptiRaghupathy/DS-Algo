import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;



public class UniqueNumbers {
	 
	static void uniquenum(String str) {
		
        HashMap<Character, Integer> h = new HashMap<>(); 
		for(int i=0;i<str.length();i++) {
			if(h.containsKey(str.charAt(i))) {
				h.put(str.charAt(i), h.get(str.charAt(i)) + 1);
			} else {
				h.put(str.charAt(i), 1);
			}
		}
		System.out.println("Result -->" +h.toString());
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        uniquenum("FFFSGFFSKOP");

    }
}

