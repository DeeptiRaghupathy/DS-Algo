import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.*;

public class RepeatedString {

    // Complete the jumpingOnClouds function below.
    static long repeatedString(String s, long n) {
    	
    	long div = n / s.length();
        long mod = n % s.length();
        long count =0;
        StringBuilder newStr = new StringBuilder();
        for(int i=0;i<s.length();i++ ) {
        	if(s.charAt(i) == 'a' || s.charAt(i) == 'A') {
        		count++;
        	}
        }
        count = count * div;
        for(int j=0;j<mod;j++) {
        	if(s.charAt(j) == 'a' || s.charAt(j) == 'A') {
        		count++;
        	}
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        long result = repeatedString("aba",10);
        System.out.println("Result --> "+result);

    }
}
