package book.ch2;

/*
 * 하나의 클래스 안에 여러개의 메소드를 선언할 수 있다.
 * 내안의 메소드는 인스턴스화 없이도 호출할 수 있다.
 * 단 내안에 있는 메소드일 지라도 static영역에서 호출할땐 반드시 인스턴스화 할것.
 */
class B {
	void go() {
		// 해결방법은?
		// 소유하고 있는 클래스의 이름으로 인스턴스화 하면 된다.
		// how?
//		B1 b = new B1(); // 이렇게
//		b.home();
	}
}

public class B1 {
	void home() { // 여기서(B1에서) B클래스가 소유한 메소드 home을 호출할 수 없다.
//		System.out.println("home호출성공");
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
