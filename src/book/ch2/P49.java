package book.ch2;

public class P49 {
	//전역변수는 클래스 전역에서 사용할 수 있다.
	int i; //전역변수 -heap[global variable, member variable, instance variable]
	public static void main(String[] args) {
		P49 p49 = new P49();
		p49.methodA();
		int i = 5; //지역변수 -stack[local variable, automatic variable]
		i = 10;
		p49.methodB(i);
		float f = 3.14f;
		double d = 3.1456;
		System.out.println(f);
		System.out.println(d);
		boolean isOK;//초기화를 해야함
		isOK= false; // 초기화
		System.out.print(isOK);
		
		
	}
	void methodA() {
		System.out.println("전역변수 i ==>"+i);
		//질문: methodA에서 10번에서 선언한 변수 i값 10을 출력하고 싶은데.... 가능한가요?
	}
	void methodB(int i) { //파라미터에 선언한 변수도 지번이다.
		System.out.println("지역변수 i는"+ i);
		
	}
}
//완결편-지역변수는 인스턴스 변수로 접근이 불가함

//전역변수만이 인스턴스 변수 즉
//p49.i로 접근할 수 있는 것임
