package book.ch4;

public class FBTest1 {

	public void methodA() {
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
	}

	public static void main(String[] args) {
		FBTest1 fbg = new FBTest1();
		fbg.methodA();

	}///////////// end of main
}
