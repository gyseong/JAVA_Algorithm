package algorithmstudy;

public class sort1 {
	public static void main(String[] args) {
		int n = 10;
		int[] arr = { 7, 4, 8, 2, 5, 3, 1, 6, 9, 10 };

		for (int i = 1; i < n; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else
					break;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
