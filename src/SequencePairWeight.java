import java.util.HashMap;
import java.util.Scanner;

public class SequencePairWeight {
	private static int countPair(int[] arr) {
		int count = 0;
		HashMap<Integer, Integer> hmp = new HashMap<Integer, Integer>();
		for(int i = 0; i < arr.length; i++) {
			if(!hmp.containsKey(arr[i])) {
				hmp.put(arr[i], 1);
			}
			else {
				count += hmp.get(arr[i]);
				hmp.put(arr[i], hmp.get(arr[i])+1);
				
			}
		}
		return count;
		
	}
	private static int finalCount(int[] arr) {
		int totalCount = 0;
		int len = arr.length;
		for(int i = 0; i < len-1; i++) {
			for(int j = i +1; j < len; ++j ) {
				int[] newNums = new int[j-i +1];
				int l = 0;
				for (int k=i; k<=j; k++) {
					newNums[l] = arr[k];
					l++;
				}
				totalCount += countPair(newNums);
			}
		}
		return totalCount;
	}
	private static void printSubArrays(int []arr, int start, int end)
	{    
	    // Stop if we have reached the end of the array    
	    if (end == arr.length)
	        return;
	     
	    // Increment the end point and start from 0
	    else if (start > end)
	        printSubArrays(arr, 0, end + 1);
	         
	    // Print the subarray and increment the starting point
	    else
	    {	
	    	int size = end -start +1;
	    	int[] ans = new int[size];
	    	int l = 0;
	        
	        for (int i = start; i <= end; i++){
	        	ans[l] = arr[i];
	        	l++;
	            
	        }
	         
	        
	        printSubArrays(arr, start + 1, end);
	    }
	     
	    return;
	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while(t-- > 0) {
//			int n = sc.nextInt();
//			int[] arr = new int[n];
//			for(int i = 0; i < n; i++) {
//				arr[i] = sc.nextInt();
//			}
//			printSubArrays(arr, 0, 0);
//			System.out.println(finalCount(arr));
//		}
//		
//		sc.close();
		int[] arr = {1,1,2,2,1};
		System.out.println(countPair(arr));
		
	}

}
