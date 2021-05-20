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
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(finalCount(arr));
		}
		
		sc.close();
	}

}
