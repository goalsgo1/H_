package book.ch2;

import javax.swing.JOptionPane;

public class Quiz5 {
//달의 중력은 지구의 17%에 불과합니다
	// 지구에서 몸무게가 100kg 인 사람은 달에 가면 17kg밖에 안됩니다.
	// 몸무게 N은 실수이고 키보드로 부터 입력 받습니다
	// 출력결과:
	// 지구몸무게:100kg
	// 달몸무게:17kg
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("지구 몸무게를 치고 엔터치기");
		System.out.println("지구 몸무게 " + s + "kg");
		double ew = Integer.parseInt(s);
		double mw = ew * 17 / 100;
		System.out.print("달 몸무게 " + mw + "kg");
	}

}
