package book.ch2;

public class Sonata {
	int speed = 0;
	void speedUp() {
		speed = speed + 1;
	}
	void speedDown() {
		speed = speed - 1;
	}
	//메인메소드는 메인스레드라고도 한다./ 메인 스레드(Thread)는 우선순위 1번이다.
	public static void main(String[] args) {
		Sonata mycar = new Sonata();
		Sonata himcar = new Sonata();
		mycar.speedDown();
		himcar.speedUp();
		System.out.println(himcar.speed);
		System.out.print(mycar.speed);
	}

}
