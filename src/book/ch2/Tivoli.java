package book.ch2;

public class Tivoli {
	//가상머신과의연결고리가 끊어졌으므로 다시 처음부터 실행할수 없다.
	public static void main(String[] args) {
		int first = 1;
		int second = 2;
		
		//프린트 메소드에는 파라밑터 두개를 정의하고있지 않거나
		//타입이 같지 않기 때문이다.
		//println메소드는 내가 정의한 메소드 인가? 
		//아니면 JDK에 내장되어 있는 메소드 입니까?
		System.out.println(first + second);
		System.out.print(second);
	}

}

