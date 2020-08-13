package book.ch4;

public class FBTest3 {

	public void methodA() {
		int i = 1;
		while (i < 101) {
			if ((i % 5 == 0) && (i % 7 == 0)) { // 5로 나누어도0 이고 7로 나누어도 0 이니?
				System.out.println("fizzbuzz");
			} else if (i % 5 == 0) {// 너 5의 배수니? 너 5로 나누었을때 나머지가 0이니?
				System.out.println("fizz");
			} else if (i % 7 == 0) {// 너 7의 배수니? 너 5로 나누었을때 나머지가 0이니?
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
			i = i + 1;
		}
	}

	public static void main(String[] args) {
		FBTest3 fbg = new FBTest3();
		fbg.methodA();
	}
}

///////// end of while
