package book.ch4;

public class Pibonachi {

	public static void main(String[] args) {
		int a[] = new int[10];
		for (int i = 0; i <= 9; i++) {
			
			if (i == 0) {
				a[i] += 1;
				System.out.println(a[0]);
			} else if (i == 1) {
				a[i] += a[i - 1];
				System.out.println(a[1]);
			} else {
				a[i] = a[i - 2] + a[i - 1];
				System.out.println(a[i]);
			}
		}
	}
}
