package ocjp.basic;

import javax.swing.JButton;
import javax.swing.JFrame;
//a 는 아빠고 b는 a의 아들이다  b가 c라는 아들이 있다. a할아버지,b아빠,c나 
//할아버지정보와 아빠의 정보 둘다 가지고있는 아빠한테 상속받는게 할아버지한테 상속받는것보다 낫다
public class JButtonArray extends JFrame {
	//9번과 10번의 차이점에 대해 말해보시오.
	String labels[] = {"조회","입력","삭제"}; //1번칸에 조회 2번칸에 입력 3번칸에 삭제를 넣는다는 말//초기화 되었다.
	JButton jbtns[] = new JButton[3]; //1,2,3번 버튼을 세개 만들어 준다는 말 //아직 초기화를 하지 않았다 //아무것도 들어가지않은 빈칸만 선언했을뿐
	//디폴트 생성자 선언해 보기 
	//디폴트 생성자의 역할은 무엇입니까?
	//1.객체지향 프로그래밍 초기화 기능
	public JButtonArray() { ///[[생성자에서 메소드 호출은 가능한가?]]]//////////
		//insert here -메소드를 호출해 보세요
		initDisplay();
	}
	public JButtonArray(int height) {
//		this.setTitle(title);
		this.setSize(700,height);
		initDisplay();
	}
	public void initDisplay() {
		this.setSize(400, 300); //나는 어디에 선언된 메소드일까요? 아빠를 찾아주세
		this.setVisible(true);  //메소드 호출시 파라미터의 갯수는 반드시 맞춰야 하나요? 아님 상관 없나요?
	}
	public static void main(String[] args) {
		//new JButtonArray("생성자에 대해서.."); // 이것은 생성자를 호출하는 문장임. 그런데 파라미터가 없는 생성자를 호출하는 것임.
		new JButtonArray(100);
		
	}

}
