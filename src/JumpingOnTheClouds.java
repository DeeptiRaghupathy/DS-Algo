import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.*;

public class JumpingOnTheClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        for(int i=0;i < c.length-1;i++) {
            if(i+2 < c.length) {
                if(c[i+2] == 0) {
                    i++;
                }
            }
            jumps++;
        }
        return jumps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] c = {0,0,0,0,1,0};

        int result = jumpingOnClouds(c);
        System.out.println("Result --> "+result);

    }
}
