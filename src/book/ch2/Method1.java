package book.ch2;

public class Method1 {
	int i =3;
	void methodA() { //메소드를 선언한 것이다.
		System.out.println("methodA 호출성"); // 실행문이다.
	}///////////////////end of methodA 다시 나를 부른곳으로 돌아감
/*
 * 11-12-13-5-6-7-14 이순서대로 코딩을 해야 도움이 된다. 	
 */	
	public static void main(String[] args) { //main method가 있어야 다른사람한테 소개해줄수 있다.
		Method1 m1 = new Method1(); //인스턴스화를 하는 줄   // m1:주소 번지
		m1.methodA(); //m1안에 있는 메소드를 호출하였다. 세미콜론으로 끝나면 호출이다.
		System.out.println("methodA 호출성공");
		
	}
} 
//학습목표 나는 클래스 안에 변수와 메소드를 구분할수 있다. ㅋ

