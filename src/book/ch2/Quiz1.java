package book.ch2;
/*
 * 학습목표
 * -나는 변수를 선언할수 있다.[핵심 키워드 - 선언 ]
 * -나는 클래스 안에서 변수와 메소드를 구분하여 말할 수 있다.[핵심 키워드 -구분 ]
 * -나는 선언한 변수에 적당한 값으로 초기화를 할 수 있다.[핵심 키워드 -초기화 ]
 * -나는 초기화의 위치가 결과값에 어떠한 영향을 주는지 설명할 수 있다.[핵심 키워드 -위치 ]
 */
public class Quiz1 {

	public static void main(String[] args) {
		int a; // a는 정수이다.(선언하였다)
		a = 5; // a에 5를 대입하였다.(정수를 담을수 있는 a에 5를 담았다.)
		int b; // b는 정수이다.(정수타입의 변수 b를 선언하였다.) 
		b = a; // b에 a를 대입하였다.
	    a = 10;
		System.out.print("변수 a는 "+a+"입니다."); //a는 바뀐다|바뀌지 않는다.
		System.out.print("변수 b는 "+b+"입니다."); //a의 초기화는 b에 영향이 있다|없다.
	}
}
