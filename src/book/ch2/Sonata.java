package book.ch2;

public class Sonata {
	int speed = 0;
	void speedUp() {
		speed = speed + 1;
	}
	void speedDown() {
		speed = speed - 1;
	}
	//���θ޼ҵ�� ���ν������� �Ѵ�./ ���� ������(Thread)�� �켱���� 1���̴�.
	public static void main(String[] args) {
		Sonata mycar = new Sonata();
		Sonata himcar = new Sonata();
		mycar.speedDown();
		himcar.speedUp();
		System.out.println(himcar.speed);
		System.out.print(mycar.speed);
	}

}
