package game.baseball;

import javax.swing.JFrame;//랭 패키지를 제외한 모든 패키지는 임포트 해줘야한다. //MVC패턴 적용된 패키지
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.lang.String;

public class MenuBarTest {
	int width;// 전역변수 선언해보기 = JFramem의 가로길이를 담을 변수
	int height;// 전역변수 선언해 보기
	// JMenuBar클래스를 활용하여 JFrame에 메뉴바를 구성할수 있다.
	JMenuBar jmb = new JMenuBar();
	
	// JMenuBar에 추가할 JMenu를 생성한다.
	JMenu jm_file = new JMenu("File");	// JMenu에 들어갈 하위 메뉴 아이템을 생성하기(New,Open,나가기)
	JMenuItem jmi_new = new JMenu("New");
	JMenuItem jmi_open = new JMenu("Open");
	JMenuItem jmi_exit = new JMenu("나가기");

	JMenu jm_edit = new JMenu("Edit");
	JMenuItem jmi_copy = new JMenu("Copy");
	JMenuItem jmi_cut = new JMenu("Cut");
	JMenuItem jmi_paste = new JMenu("Paste");

	JMenu jm_source = new JMenu("Source");
	JMenuItem jmi_toggleComment = new JMenu("ToggleComment");
	
	JMenu jm_game = new JMenu("game");
	JMenuItem jmi_new1 = new JMenu("new");
	JMenuItem jmi_answer1 = new JMenu("answer");
	JMenuItem jmi_clear1 = new JMenu("clear");
	JMenuItem jmi_exit1 = new JMenu("exit");
	

	// 화면 그리기
	// 재사용을 위한 첫걸음이 메소드 중심의 코딩을 전개하는 것이다.
	public void initDisplay() { // 화면에 대한 것들은 여기에
		System.out.println("itnitDisplay 호출성공");
		
		
		//////////// 메뉴 바 구성하기 시작 //////////////////
		jm_file.add(jmi_new);
		jm_file.add(jmi_open);
		jm_file.add(jmi_exit);

		jm_edit.add(jmi_copy);
		jm_edit.add(jmi_cut);
		jm_edit.add(jmi_paste);

		jm_source.add(jmi_toggleComment);
		
		jm_game.add(jmi_new1);
		jm_game.add(jmi_answer1);
		jm_game.add(jmi_clear1);
		jm_game.add(jmi_exit1);

		jm_file.setMnemonic('F'); // Art = F
		jm_edit.setMnemonic('E'); // Art = E
		jm_source.setMnemonic('S');
		jm_game.setMnemonic('g');

		jmb.add(jm_file);
		jmb.add(jm_edit);
		jmb.add(jm_source);
		jmb.add(jm_game);
		//////////// 메뉴 바 구성하기 시작 //////////////////
		// JABA API를 활용하여 윈도우 운영체제에서 화면을 열기
		// jaba.lang패키지를 제외한 모든 패키지는 반드시 import를 해주어야 해당 클래스를 JDK가 찾을수 있다.
		JFrame jf = new JFrame();
		boolean isView;
		isView = true;
		int width = 600;
		// 이 메소드는 non-static영역이다.
		this.width = 300;
		this.height = 400;
		jf.setJMenuBar(jmb);
		jf.setSize(width, width); // 괄호안에 int가 와야한다.파라미터는2개가 와야한다.//소수점일땐 캐스팅연산자를 쓰자(double)int
		jf.setVisible(isView);// true-음악을 듣고 있을 때 false- 음악을 듣고 있는데 전화가 들어온다.

	}

	public static void main(String[] args) {
//내 안에 있는 메소드 이더라도 static영역에서 non-static 메소드를 호출하려면 반드시 인스턴스화
		MenuBarTest mbt = new MenuBarTest();
		mbt.initDisplay();
	}/// END OF MAIN

}
