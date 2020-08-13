package book.ch4;

public class SwitchTest1 {
	public static int others(int x) { //x=5일때를 기준으로    
		//switch(x-1) 도 가능하다 값이 오는 자리이기 때문에
		switch(x) {
		case 6 : x--; //5
		case 5 : x--; //4
		case 4 : x--; //3 ->case2
		case 3 : x--; //2
		break;  //여기서 switch문 탈출 여기서 x는 2
		default: x--;
		break;
		}
		return x; // x는 2가 담겨있다.
	}
	//메소드 앞에 static이 있으면 인스턴스화가 필요없다.
	//static이 없는 메소드를 호출할땐 무조건 인스턴스화 한다.
	//파라미터 자리는 지역변수 자리이다. - 반드시 초기화를 해주어야 한다. - 선언만 하는것은 문제 되지 않지만 사용할 땐 문제가 된다.(코딩해본사람만 아는)
	public static int switchit(int x) { //파라미터 자리의 x값은 호출할 때 결정 됩니다. //x에 4가 들어가면 case 4부터 실행
		int j = 1;
		switch(x) {
		case 1: j++;
		case 2 :j++;
		case 3: j++;
		case 4: j++; //2
		case 5: j++;//3
		default: j++; //4
		}//////////end of switch
		return j+x;
	}
	public static void main(String[] args) {
		//intsert here  - switchit 호출시 x값을 4로 한다면 출력 결과는 얼마일까요??
		//static메소드인 main안에서 static으로 선언된 switchit메소드를 호출 할때는 클래스 이름.메소드 이름으로 호출함.
		SwitchTest1 st1 = new SwitchTest1();
		int x = SwitchTest1.others(5);
		System.out.print(x);
		System.out.print("=====================");
		int x2 = st1.switchit(4); //공유
		System.out.print(x2);
	}

}
