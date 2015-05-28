package ocjp.gold.example06;

public class Test {
	public static void main(String args[]) {
		int[] n = { 4, 0, -3, 7, 0, 5 };
		for (int i : n) {
			System.out.println("result == " + divide(i));
		}
	}

	static int divide(int n) {
		assert (n != 0);
		int m = 765;
		return m / n;
	}
}
