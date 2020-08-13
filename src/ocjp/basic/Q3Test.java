package ocjp.basic;

public class Q3Test {
//조건문 안에 실행문이 한 개 일때는 좌중괄호와 우중괄호를 생략할 수 있다.
	public static void main(String[] args) {
		int x = 5;
		boolean b1 = true;
		boolean b2 = false;

		if ((x == 4) && !b2) { // &&연산자가 두개일때는 첫번째 조건이 거짓이면 뒤에 조건은 안본다.
			System.out.print("1");
		}
		System.out.print("2");

		if ((b2 = true) && b1) { // B2에 true를 대입하는것 b2도 true가 되고 b1도 이미 true 여서 3이 찍힌다.
			System.out.print("3");
		}
	}

}
