package algo.recursion;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void reduceByOne(int n) {
		if(n >= 0) {
			reduceByOne(n - 1);
		}
	}
	
	public static int recusiveLinearSearch(int [] a, int i, int x) {
		
			if (i > a.length-1) {
				return -1;
			}else if (a[i] == x) {
				return i;
			}else
				return recusiveLinearSearch(a, i + 1, x);
		
		
	}

}
