import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class BinarySearch {
	 private static int array[] = new int [100];
	 private static int length;
	
	public static int randomNumberGenerator(int min, int max) {
	    Random random = new Random();
	    int randomNum = random.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
	public static void sort(int [] numArr) {
		if (numArr == null || numArr.length == 0) {
            return;
        }
        array = numArr;
        length = numArr.length;
        quickSort(0, length - 1);
	}
	
	private static void quickSort(int lowerIndex, int higherIndex) {
        
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private static void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
	
	public static int searchNumber(int num, int [] numArr) {
		int retVal=-1, min  = 0, max  = numArr.length - 1, mid = (min + max)/2;
	 
	    while( min <= max )
	    {
	      if ( array[mid] < num )
	        min = mid + 1;    
	      else if ( array[mid] == num ) 
	      {
	        retVal = mid+1;
	        break;
	      }
	      else
	         max = mid - 1;
	 
	      mid = (min + max)/2;
	   }
	   if ( min > max )
	      retVal = -1;
	   return retVal;
	}
	
	//Main class
	public static void main(String args[]) throws IOException {
		System.out.println("\tBinary Search Program\n\n");
		System.out.println("Generating random numbers...\n");
		for(int i=1;i<=100;i++) {
			array[i-1] = randomNumberGenerator(10,500);
			System.out.print("\t"+array[i-1]);
			if(i%10==0)
				System.out.println("\n");
		}
		System.out.println("\n\nEnter a number to search : ");
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		int i = Integer.parseInt(br.readLine());
		sort(array);
		int elemPos = searchNumber(i,array);
		if(-1!=elemPos)
			System.out.println("Search element is at "+elemPos+" position");
		else
			System.out.println("Search element not found!");
		
	}
}
