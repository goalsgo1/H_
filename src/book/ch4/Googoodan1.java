package book.ch4;

public class Googoodan1 {

	public void methodA() {
		int i = 2;
		int j = 1;
		while (i < 10) {
			while (j < 10) {
				System.out.println(i + "*" + j + "=" + i * j);
				j = j + 1;
			}
			j = 1;
			i = i + 1;
		}
	}
	//반복문 사용시 무한루프를 방지할 수 있는 코드를 생각해 보세요.
	public static void main(String[] args) {
		Googoodan1 ggd = new Googoodan1();
		ggd.methodA();
	}
}
