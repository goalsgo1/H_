package book.ch5;

import javax.swing.JButton;
import javax.swing.JFrame;
//오늘 부터는 되도록이면 메인 메소드에 코딩을 하지 않는다.
//한번에 어렵다면 조금씩 부피를 줄여본다.
//생성자는 의존관계를 실제로 표현할 수 이ㅣㅆ다. - 클래스 쪼개기  연습시 꼭 활용해 볼것
//static은 사용하지 말것 - 주의사항
//while문에 i=i+1; -while문에 증감연산자를 빼먹는것 , break를 빼먹는것, for문안에 break를 빼먹는것
//반드시 무한루프 방지 코드를 작성할것.
public class DeptManager extends JFrame { //재사용이 가능한 코딩을  첫시작...
	int deptno;
	//BorderLayout --- 안드로이드 수업.
	JButton jbtn_center = new JButton();
	JButton jbtn_north = new JButton("북쪽");
	JButton jbtn_south = new JButton("남쪽");
	JButton jbtn_east = new JButton("동쪽");
	JButton jbtn_west = new JButton("서쪽");
	//역할은 전번에 초기화를 대신 해줌. 그래서 생략이 가능하다.
	//지번은 초기화를 반드시 해야 됨.
	public DeptManager() { //디폴트 생성자는 생략할 수 있다.
		System.out.println("디폴트 생성자gg.");
	}
	public DeptManager(int deptno) { //디폴트 생성자는 생략할 수 있다.
		this.deptno = deptno; //deptno를 여기서도 쓸수 있다. 
		this.deptno = 30; //변수의 대한재정의 값을 바꿔준다.
		System.out.println("디폴트 생성자ㅎㅎ.");
//		DeptManager me = new DeptManager();
		//DeptManager을 인스턴스화 하면 위 DeptManager()도 같이 호출된다?????
//		me.methodA();  //void methodA 호출
		methodA(); //바로위 주석처럼 주소번지 연결 안해도 호출 가능......
		initDisplay(); // 주소번지없어도 호출 가능
		
	}
	void methodA() { //디폴트 생성자는 생략할 수 있다.
		System.out.println("methodA에서 "+deptno); //전역변수로 deptno가 없으면 안된다.
	}
	
	public void initDisplay() { //화면 그리기
		jbtn_center.setText("중앙");
		this.add("Center",jbtn_center);
		this.add("North",jbtn_north);
		this.add("South",jbtn_south);
		this.add("East",jbtn_east);
		this.add("West",jbtn_west);
		this.setSize(400, 300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true); //화면 늘리기 줄이기 버튼이 생성되었다.
		new DeptManager(11); //숫자를 안넣으면 첫번째 Deptmanager()가 호출이 되고
							 //숫자를 넣으면 두번째 Deptmanager(int deptno)가 호출이 된다.
	}

}
