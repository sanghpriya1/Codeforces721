import java.util.Scanner;

public class AndThenThereWereK {
	private static int leftMostBit(int n) {
		if(n == 0)return 0;
		
		int lmb = 0;
		n = n>>1;
		while(n != 0) {
			n = n >> 1;
			lmb++;
		}
		lmb = 1 << lmb;
		return lmb;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			
			
			System.out.println(leftMostBit(n)-1);
		}
		
		sc.close();
	}
}
