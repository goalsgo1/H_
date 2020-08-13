package book.ch4;

public class FbTest {

	public static void main(String[] args) {
//		int i = 0;
//		for (i = 1; i <= 100; i = i + 1) {
//			if ((i % 5 != 0) & i % 7 != 0) {// 5�� ����� �ƴϰų� 7�� ����� �ƴϸ�
//				System.out.println(i); // ���ڸ� �ø���.
//			} /// end if
//			else if (i % 5 == 0 & i % 7 != 0) { //5�� ����̰� 7�� ����� �ƴϸ�
//				System.out.println("fizz");

//			} /// end else
//			else if (i % 5 != 0 & i % 7 == 0) { //5�� ����� �ƴϰ� 7�� ����̸�
//				System.out.println("buzz");

//			} /// end else
//			else if (i % 5 == 0 & i % 7 == 0) {// 5�� ������̰� 7�� ����̸�
//				System.out.println("fizzbuzz"); // fizzbuzz
//			} /// end if
//		} /// end for
		// 1부터 100까지 센다
		for (int i = 1; i <= 100; i++) {
			if ((i % 5 == 0) && (i % 7 == 0)) { // 5로 나누어도0 이고 7로 나누어도 0 이니?
				System.out.println("fizzbuzz");
			} else if (i % 5 == 0) {// 너 5의 배수니? 너 5로 나누었을때 나머지가 0이니?
				System.out.println("fizz");

			} else if (i % 7 == 0) {// 너 7의 배수니? 너 5로 나누었을때 나머지가 0이니?
				System.out.println("buzz");
			} else
				System.out.println(i);
		}
	}/////////////end of main
}
