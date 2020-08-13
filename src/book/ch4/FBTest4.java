package book.ch4;

public class FBTest4 {

	public void methodA() {

		int i = 1;

		while (i < 101) { // i를 35로 나누기
			switch (i % 35) { // i를 35로 나누기
			case 0: {
				System.out.println("fizzbuzz");
				break;
			}
			case 5:
			case 10:
			case 15:
			case 20:
			case 25: {
				System.out.println("fizz");
				break;
			}
			case 7:
			case 14:
			case 21:
			case 28: {
				System.out.println("buzz");
				break;
			}
			default: {
				System.out.println(i);
			}

			}
			i = i + 1;
		}

	}

	public static void main(String[] args) {
		FBTest3 fbg = new FBTest3();
		fbg.methodA();
	}

}
