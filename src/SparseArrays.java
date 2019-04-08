import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SparseArrays {
	static void sparsearray(String[] strings, String[] queries) {
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		int value;
		for(int i=0;i<strings.length;i++) {
			if(Arrays.asList(queries).contains(strings[i])) {
				value = h.get(strings[i]) != null ? h.get(strings[i])+1 : 1;
				h.put(strings[i],value);
			}
		}
		int arr[] = new int[h.size()]; 
        for (int i=0;i<h.size();i++) 
            arr[i] = h.get(queries[i]).intValue();  
		System.out.println(Arrays.toString(arr));						
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String strings[] = {"aba","baba","aba","xzxb"};
		String queries[] = {"aba","xzxb","ab"};		
		sparsearray(strings,queries);

	}
}

