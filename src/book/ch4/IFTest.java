package book.ch4;

import javax.swing.JOptionPane;

//모든 클래스는 object로 부터 상속받아서 만들어 진 것이다.
public class IFTest {

	public static void main(String[] args) {
		// 사용자로 부터 점수를 입력받는다.
		// 사용자가 입력한 점수를 담을 변수를 선언하세요.
		// 사용자가 입력한 값을 받는 방법은 무엇입니까?
		// 또 그값을 받았을때 타입은 뭐죠?
		String i = JOptionPane.showInputDialog("점수를 입력하고 엔터치기");
//		System.out.print("입력한 점수" + i);
		int i_jumsu = Integer.parseInt(i);
		if (i_jumsu >= 90) { // if안에는 객관적인 주관적인게 와야한다/?
			System.out.print("당신은 A학점을 받았습니다.");
		} else if (i_jumsu < 90 && i_jumsu >= 80) { //&&는 앞에꺼 안맞으면 뒤에껀 볼필요x 교집합
			System.out.print("당신은 B학점을 받았습니다.");
		} else if (i_jumsu < 80 && i_jumsu >= 70) {
			System.out.print("당신은 C학점을 받았습니다.");
		} else if (i_jumsu < 70 && i_jumsu >= 60) {
			System.out.print("당신은 D학점을 받았습니다.");
		} else {
			System.out.print("당신은 F학점을 받았습니다.");
		}
	}
}
