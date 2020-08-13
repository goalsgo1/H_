package game.baseball;

import javax.swing.JOptionPane;

public class BBGameSimulation {

	public static void main(String[] args) {
		BaseBallGame bbg = new BaseBallGame();
		bbg.rancom();
		System.out.println(bbg.com[0]+""+bbg.com[1]+""+bbg.com[2]);
		System.out.println("========[[for문으로 테스트 하기]]======");
		//만일 10번 확인하고 싶으면
		/*//////////범위 주석
		for (int i = 0; i < 10; i++) {
			bbg.rancom();
			System.out.println(bbg.com[0]+""+bbg.com[1]+""+bbg.com[2]);
		}
		*/
//		String result = bbg.account("256");
//		System.out.println("result::"+result);
		String user = JOptionPane.showInputDialog("세자리 숫자를 입력하세요.");
		String result = bbg.account(user);
		System.out.println("result::"+result);
	}

}
