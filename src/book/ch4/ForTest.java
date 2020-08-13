package book.ch4;

public class ForTest {// 1 부터 10까지 세면서 짝수의 합과 홀수의 합을 동시에구해주는ㄴ 프로그램의 순서도를 그려보시오

	public static void main(String[] args) {
//		int Even = 2; // 짝수
//		int odd = 1; // 홀수
//		for (int i = 0; i <= 9; i++) {
//			if (i % 2 == 0) {
////				System.out.println(Even);
//				Even = Even + 2;
//			} else {
////				System.out.println(odd);
//				odd = Even - 1;
//			}
//		}
//		System.out.println(Even);
////		System.out.println(odd);

//		int Even = 0;
//		int odd = 0;
//		int Evenhap = 0;
//		int oddhap = 0;
//		for (int i = 1; i <= 10; i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		int even = 0;
		int odd = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				even = even + i;
			} else {
				odd = odd + i;
			}
		}
		System.out.println(even);
		System.out.println(odd);
	}

}
