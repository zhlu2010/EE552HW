package weiqi;

public class LegalMove {
	private int[]x =new int[361];
	public LegalMove() {
		for (int i = 0;i<x.length;i++) {
			x[i]=0;
		}
	}
	public int testlegal(int j) {
		if (x[j]==0) {
			x[j]=1;
			return 0;
		}else {
			//System.out.println("it's illegal");
			return 1;
		}
	}
}
