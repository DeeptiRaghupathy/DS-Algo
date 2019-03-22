import java.io.IOException;
import java.util.Scanner;

public class BribedQueue {
	// Complete the jumpingOnClouds function below.
    static void minimumBribes(int[] q) {
        int noOfPosition =0;
        int count=0;
        for (int i = 0; i < q.length; i++) {
            int moves= q[i]-(i+1);
            if(moves > 2){
                System.out.println("Too chaotic");
                return;
            }
            for(int j=0;j<i;j++) {
            	if(q[j] > q[i]) {
            		count++;
            	}
            }
        }
        System.out.println(count);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	int [] q = {1,2,5,3,7,8,6,4};
        minimumBribes(q);
    }
}
