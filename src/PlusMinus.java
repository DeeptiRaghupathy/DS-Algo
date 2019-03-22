import java.io.IOException;
import java.util.Scanner;

public class PlusMinus {
	static void plusMinus(int[] arr) {
		float pos = 0, neg = 0, zer = 0, total = arr.length;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == 0) {
            	zer++;
            } else if (arr[i] > 0) {
            	pos++;
            } else {
            	neg++;
            }
        }
        System.out.printf("%.6f\n", pos/total);
        System.out.printf("%.6f\n", neg/total);
        System.out.printf("%.6f\n", zer/total);
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	int [] arr = {-4,3,-9,0,4,1};
        plusMinus(arr);
    }
}
