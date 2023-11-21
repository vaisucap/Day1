package testnew;

public class Dupe {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 56, 78, 3, 78 };
		int[] f = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					f[j] = ++count;
				}
			}
			count = 0;
		}
		for (int i = 0; i < arr.length; i++) {
			if (f[i] > 0) {
				System.out.println("Dupe value:" + arr[i] + ",count:" + (f[i] + 1));
			}
		}
	}
}

