package book.ch2;

//주석은 실행되지 않습니다.
//주석에는 업무에 대한 내용과 담당자 이름, 버전정보 등 회사 고유 업무내용이
//포함된다.
//따라서 배포할땐 XXX.class만 배포함.
public class Variable2 {

	// 전역변수의 위치(이 코드엔 전역변수는 없다.)
	int i; //전역변수로 초기화를 생략할수 있다. //선언만 해도 j=0이다.
	//j = 5 이건 반칙

	/*********************************
	 * 로그인 버튼을 누름녀 이 메소드를 호출
	 * 
	 * @param id - 사용자가 입력하는 값을 받음
	 * @param pw - 사용자가 입력한 비번을 받음
	 * @return - 아이디와 비번을 비교해서 모두 일치하면(교집합) 학습목표 나는 메소드의 파라미터 자리에 선언되는 변수가 무엇인지 설명할
	 *         수 있다. 내안에 있는 메소드라 하더라도 메인 메소드에서 호출하려면 인스턴스화한 후
	 *         인스턴스변수.login("apple","123") 회원가입 - 등록 - 오라클 로그인 - 조회(찾기)
	 ****************************/

	String login(String id, String pw) { // id와 pw는 지역변수 이다.id와pw는 지역변수이므로 자동으로 삭제된다.
		// id와pw는 login메소드 안에서만 사용 가능하다.
		return "홍길동님 환영합니다.";
	}

	void methodA(int i) { // i는 지변임, methodA안 지변은 methodA안에서만 접근가능.
		System.out.println("지역변수 i:" + i);
		// 내 안에 있는 메소드는 인스턴스화 없이 호출 할 수 있음.
		login("haha", "123"); // 메소드 호출

	}

	public static void main(String[] args) {
//		variable2 login = new variable2()
		Variable2 v2 = new Variable2();
//		v2.login("haha", "123");// 여기서는 왜 문법에러가 나는 걸까요?
//		variable2 ma = new variable2();
		v2.methodA(4);  //methodA 호출하는법?
		
		System.out.println("전역변수 i :" + v2.i);
		//전역변수 i 와 지역변수 i를 따로 호출하기 위해선
		//메인에서 클래스 주소 번지를 만들고 그 주소의 전역변수를 메인에서 호출
		//methodA에서의 지역변수를 호출하기 위해
		//메인에서 앞서 만들었단 클래스 주소 번지안의 methodA를 호출하는 함수를 만들고
		//
	}

}
