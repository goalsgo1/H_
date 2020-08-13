package book.ch2;

public class Parameter1 {
//	Parameter p2 = new Parameter(); //전역변수(전변)
	//값에 의한 호출입니다
	//그래서 지변 x에 10담기고 지번y에  20 담긴다.
	void methodA(int x, int y) {
		System.out.println("methodA호출성공");
//		p2.methodA(1,2);
		System.out.println(x+y);
	}
	//메소드 선언할 때 반환 타입을 결정할 수 있다.
	//리턴 타입이 있는 경우 실행문 맨 마지막에 반드시 return이라는 예약어를
	//써주어야 한다.
	//이때 리턴 다음에는 값이나 혹은 변수 명이 올 수 있다.
	//단 변수의 타입이 리턴 타입과 반드시 일치해야 함.
	double methodB(double d1, double d2) { //선언 (지변) //지역변수는 메인메소드 안에서 사용할수 없다...
		double hap =0.0;
		hap = d1+d2;
		System.out.print(hap);
		return hap;
//		return 0;
	}
	
	public static void main(String[] args) {
		//RAM영역에 Parameter클래스를 로딩하기
		//p1은 지역변수이다.
		Parameter1 p1 = new Parameter1();
//		double hap = p1.methodA(10,20);
		double hap2 = p1.methodB(10,20); //methodB는 사용할수 있지만 methodA는 보이드여서 사용할수 없다.
		System.out.print(hap2);
		
		
	}//A라는 메소드의 처리 결과가.. 메소드 B에서 재사용하고 싶을때 (두번계산 싫을때) 리턴사용할것 --시간을 아낄수 있다
	//리턴타입이 보이드인  경우 프린트 메소드에 사용할수 없다.
	
	

}
