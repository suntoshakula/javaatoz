package array.type;

public class ArrayType {

	public static void main(String args[]) {
		arrayInt();
		jaggedAr();
	}

	private static void jaggedAr() {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[2];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void arrayInt() {
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 10;
		a[3] = 20;
		a[4] = 10;
		int b[] = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < a.length; i++) {
			System.out.println(b[i]);
		}
		for (int i : a) {
			System.out.println(i);
		}
	}

}
