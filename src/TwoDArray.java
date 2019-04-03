import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TwoDArray {
	static void hourGlass(int[][] arr) {
		List<Integer> hourGlassSums = new ArrayList<>();
		int arrLen = arr.length, sum=0;
		for(int i=0;i+2<arrLen;i++) {
			for(int j=0;j+2<arrLen;j++) {
				sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
						+ arr[i + 1][j + 1] +
						arr[i+2][j] + arr[i +2][j+1] + arr[i + 2][j+2];
				hourGlassSums.add(sum);
			}
		}
		System.out.println(Collections.max(hourGlassSums));						
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int arr[][] = {{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},{0,0,1,2,4,0}};
		hourGlass(arr);

	}
}

