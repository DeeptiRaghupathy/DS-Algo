import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class GoldPile {
	static void pileOfGold(List<Integer> pile) {
		Set<Integer> h = new HashSet<Integer>();
		int max = Collections.max(pile);
		for(int i=0;i<pile.size();i++) {
			if(pile.get(i) != max && !h.contains(pile.get(i))) {
				h.add(pile.get(i));
			}
		}
		System.out.print(Collections.max(h));
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		List<Integer> arr= new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(3);
		arr.add(2);
		arr.add(1);
		pileOfGold(arr);
	}
}

