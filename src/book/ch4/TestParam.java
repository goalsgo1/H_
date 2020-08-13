package book.ch4;
class Param{
	int ival;
}
public class TestParam {
	
	void effectParam(Param p) {
		//p = new Param();
		p.ival = 500;
		System.out.println("sub ival===>"+p.ival);
	}
	public static void main(String[] args) {
		//내 안에 있는 메소드 이지만 static영역에서 effectParam메소드를 호출하려면
		//반드시 인스턴스화를 해야함
		TestParam tp = new TestParam();
		//effectParam메소드를 호출할 예정인데 메소드에 파라미터가 param타입이 들어있음.
		//그래서 인스턴스화 하였음. 인스턴스화 하지 않으면 가리키는 객체는 없이 타입만 있는거임.
		Param p = new Param();
		//main메소드 안에서 선언했기에 지변의 성격을 가지고 있다.
		//그 클래스에 선언된 ival변수는 처음에 0이였으나 아래 초기화를 통해 100이 담김.
		p.ival = 100;
		//아래에서는 내 안에 잇는 메소드를 호출 함 이때 18번 라인에 정의한 주소 번지를 넘김.
		tp.effectParam(p);//참조에 의한 호출이다.
		System.out.println("main ival===>"+p.ival);
	}
}//tp와 p는 클래스를 가져온 것이다.
//p.ival = 100 이다
//tp.effectParam(p)는 param p가 들어있는 보이드를 호출한 것으로 
//sub ival은 자연스럽게 500이 나온다
//8번이 주석처리 되었을땐
//p.ival이 23번에서 참조에 의한 호출로 effectParam으로 넘어가서 쭉쭉 내려와 p.ival = 500의 값을 받고
//main의 시스템 프린트 메인에 500이 찍힌다
//8번줄이 실행되었을땐
//23번에서 참조에 의한 호출이 되어서 넘어갔는데 
//new Param(); 으로 타입은 같은데 주소 이름만 같고 주소는 다른 p와 p가 생긴다
//effectparam에서  500으로 바뀐건 새로 생긴 p라는 주소의 ival이고 
//원래 있던 p.ival은 23번에서 500으로 바뀌지 않고 24번으로 내려와서
//24 프린트 메인은 100이 찍힌다.