package uniqueSum;

public class UniqueSum {

	public static void main(String[] args) {
		System.out.println(uniqueSum(1, 2, 3));
		System.out.println(uniqueSum(3, 3, 3));
		System.out.println(uniqueSum(1, 1, 2));

	}

	public static int uniqueSum(int a, int b, int c) {
		if (a == b && a == c) {
			return 0;
		} else if (b == c) {
			return a;
		} else if (a == c) {
			return b;
		} else if (a == b) {
			return c;
		} else {
			return a + b + c;
		}
	}

}
