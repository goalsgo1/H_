package book.ch2;

/*
 * �ϳ��� Ŭ���� �ȿ� �������� �޼ҵ带 ������ �� �ִ�.
 * ������ �޼ҵ�� �ν��Ͻ�ȭ ���̵� ȣ���� �� �ִ�.
 * �� ���ȿ� �ִ� �޼ҵ��� ���� static�������� ȣ���Ҷ� �ݵ�� �ν��Ͻ�ȭ �Ұ�.
 */
class B {
	void go() {
		// �ذ�����?
		// �����ϰ� �ִ� Ŭ������ �̸����� �ν��Ͻ�ȭ �ϸ� �ȴ�.
		// how?
//		B1 b = new B1(); // �̷���
//		b.home();
	}
}

public class B1 {
	void home() { // ���⼭(B1����) BŬ������ ������ �޼ҵ� home�� ȣ���� �� ����.
//		System.out.println("homeȣ�⼺��");
	}

	void come() {

	}

	public static void main(String[] args) {
//		B b = new B();
//		b.go();
//		int val = Integer.parseInt("10");
//		double dval = Double.parseDouble("3.14");
//		String sVal = "10";
//		int val2 = Integer.parseInt(sVal);
//		B b = new B();
//		b.come();
//		b.come();
		
		int firstnumber = Integer.parseInt("10");
		int secondnumber = Integer.parseInt("5");
		int a = firstnumber + secondnumber ;
		System.out.print(a);
		
	}

}
