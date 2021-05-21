
public class MSB {
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
		
		int n = 17;
		int k = leftMostBit(n);
		
		System.out.println(k-1);
	}

}
