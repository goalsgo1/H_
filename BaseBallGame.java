package game.baseball;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

/*
 * 이벤트 처리 3단계
 * 1.JTextField가  지원하는 이벤트 처리 담당 클래스를 implements 한다.
 * 2.1번에서 추가된 이벤트 처리 담당 클래스가 선언하고 있는 actionPerformed메소드를 재정의 해야함. 안하면 문법에러가 생김
 * 3.이벤트 소스(이벤트 처리 대상 클래스의 주소번지)와 이벤트 처리를 담당하는 클래스를 연결하기
 */
public class BaseBallGame implements ActionListener {
	JFrame jf = new JFrame(); //
	// 이미지를 담은 물리적인 위치 선언하기.
	String imgPath = "C:\\workspace_java\\dev.java\\src\\game\\baseball\\";
	// ImageIcon bg = new
	// ImageIcon(imgPath+"o_1bf8ua8rh1inv107u1f151fj01raoa2.jpg");
	//// ImageIcon bg = new ImageIcon(imgPath +
	// "o_1bf8ua8rh1inv107u1f151fj01raoa.jpg");
	Image img = jf.getToolkit().getImage(imgPath+"o_1bf8ua8rh1inv107u1f151fj01raoa2.jpg");

	// 이미지 버튼을 만드는데 필요한 클래스 선언하기
	JButton jbtn_inew = new JButton();
	JMenuBar jmb = new JMenuBar();

	JMenu jm_game = new JMenu("게임");
	JMenuItem jmi_new = new JMenuItem("새게임");
	JMenuItem jmi_dap = new JMenuItem("정답");
	JMenuItem jmi_clear = new JMenuItem("지우기");
	JMenuItem jmi_exit = new JMenuItem("나가기");

	JMenu jm_info = new JMenu("도움말");
	JMenuItem jmi_detail = new JMenuItem("야구숫자게임이란?");
	JMenuItem jmi_create = new JMenuItem("만든사람들");

	JToolBar toolbar = new JToolBar();

	// 중앙에 들어갈 속지 선언
	JPanel jp_center = new JPanel();
	// 세자리 숫자를 입력 후 엔터를 쳤을때 사용자가 입력한 숫자와 숫자를 맞추기위한 힌트문
	// 을 출력해줄 화면
	JScrollPane jsp_display = null;
	JTextArea jta_display = null;
	
	
	//JTextArea jta_display = new JTextArea();
	JTextField jtf_user = new JTextField();
	// 글꼴과 글꼴에 대한 스타일과 글자 크기를 정해줌.-인스턴스화를 통해서, 그 값들은 생성자의 파라미터로 결정됨
	Font f = new Font("Thoma", Font.BOLD, 14); // 인스턴스화
	// 동쪽에 들어갈 속지 생성하기
	JPanel jp_east = new JPanel();
	// 새게임, 정답, 지우기, 나가기 버튼 추가하기
	JButton jbtn_new = new JButton("새게임");
	JButton jbtn_dap = new JButton("정답");
	JButton jbtn_clear = new JButton("지우기");
	JButton jbtn_exit = new JButton("나가기");

	int my[] = new int[3]; // 내가 고른 세자리 숫자 배열
	int com[] = new int[3]; // 컴퓨터가 고른 세자리 숫자 배열
	int cnt = 0; // 힌트 문장에서 순번을 출력하는 변수
	/*
	 * 배경이미지 구현
	 * 
	 * class BgPanel extends JPanel { public void paintComponent(Graphics g) {
	 * g.drawImage(bg.getImage(), 0, 0, null); setOpaque(false);
	 * super.paintComponent(g); } }
	 */

	// 세자리 임의의 숫자를 채번하는 메소드 구현하기
	public void rancom() { // 컴퓨터가 임의의 숫자를 채번하는.......5
		com[0] = (int) (Math.random() * 10);
		do {
			com[1] = (int) (Math.random() * 10);
		} while (com[0] == com[1]);
		do {
			com[2] = (int) (Math.random() * 10);
		} while (com[0] == com[2] || com[1] == com[2]);
	}
	// 사용자가 입력한 값을 판정하는 메소드를 구현해 봅시다.

	// 사용자가 입력한 값을 판정하는 메소드를 구현해 봅시다.
	public String account(String user) {
		if (user.length() != 3) {
			return "세자리 숫자를 입력하세요";
		}

		// 사용자가 jtf_user에 입력한 숫자는 보기에는 숫자 처럼 보여도 알맹이는 문자열로
		// 인식을 합니다. 그래서 형전환을 한 후 my[]배열에 담아야 합니다.
		// 문자열 "256"을 숫자로 담을 변수 선언
		int temp = 0;
		int strike = 0; // 힌트로 사용될 스트라이크를 담을 변수 선인
		int ball = 0;// 볼을 담을 변수 선언
		// strike와ball을 지역변수로 해야 하는건 매 회차 마다 값이 변해야 하기 때문이다.*************중요

		try {
			temp = Integer.parseInt(user);
		} catch (NumberFormatException e) {
			return "숫자만 입력하세요";
		}
		temp = Integer.parseInt(user);
		my[0] = temp / 100;
		my[1] = (temp % 100) / 10;
		my[2] = temp % 10;
		JOptionPane.showMessageDialog(null, my[0] + "" + my[1] + "" + my[2]);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (my[i] == com[j]) {// 너 안에 내가 가진 숫자가 있는거야?
					if (i == j) // 그러면ㄴ 자리까지도 일치하는 거니?
						strike++;
					else
						ball++;

				}
			}
		}
		if (strike == 3) {
			return "축하합니다. 정답입니다!!!";
		}
		return strike + "스" + ball + "볼";
	}

	// 나가기 버튼이나 나가기 메뉴 아이템을 선택(클릭)했을때 호출되는 메소드 구현
	public void exit() {
		System.out.println("exit 호출성공");

		System.exit(0);// 자바가상머신과의 연결을 끊어버린다.
	}

	// 화면을 그려주는 메소드 선언
	public void initDisplay() {
		jta_display = new JTextArea() {
			public void paint(Graphics g) {
				g.drawImage(img,0,0,null);
				Point p= jsp_display.getViewport().getViewPosition();
				g.drawImage(img, p.x, p.y, null);
				paintComponent(g);
			}
		};
		jsp_display = new JScrollPane(jta_display);
		//jf.setContentPane(new BgPanel()); // 카카오톡 로그인창 만들때 쓸수 있음.
		//////////// 툴바에 들어갈 이미지 버튼 추가하기/////////
		jbtn_inew.setIcon(new ImageIcon(imgPath + "new.gif"));
		toolbar.add(jbtn_inew);
		/////////// 툴바에 들어갈 이미지 버튼 추가하기 끝///////////
		////////// 메뉴 바 추가 시작///////////////
		jm_game.add(jmi_new);
		jm_game.add(jmi_dap);
		jm_game.add(jmi_clear);
		jm_game.add(jmi_exit);

		jm_info.add(jmi_detail);
		jm_info.add(jmi_create);

		jmb.add(jm_game);
		jmb.add(jm_info);
		////////// 메뉴 바 추가 끝//////////////
		System.out.println("initDisplay 호출성공");

		// 이벤트 소스와 이벤트 처리 클래스를 매핑하는 코드 추가
//		EventHandlar ehandler = new EventHandlar();
//		jtf_user.addActionListener(ehandler);
		jtf_user.addActionListener(this); // 여기서 this는 자기자신 클래스를 가리킴.-BassBallGame:내안에 actionPerformed

		jbtn_new.addActionListener(this);
		jbtn_dap.addActionListener(this);
		jbtn_clear.addActionListener(this);
		jbtn_exit.addActionListener(this);
		jmi_exit.addActionListener(this);
		// 버튼색상
		jbtn_new.setBackground(new Color(158, 9, 9));
		jbtn_new.setForeground(new Color(212, 212, 212));
		jbtn_dap.setBackground(new Color(7, 84, 170));
		jbtn_dap.setForeground(new Color(212, 212, 212));
		jbtn_clear.setBackground(new Color(19, 99, 57));
		jbtn_clear.setForeground(new Color(212, 212, 212));
		jbtn_exit.setBackground(new Color(54, 54, 54));
		jbtn_exit.setForeground(new Color(212, 212, 212));

		jp_east.setLayout(new GridLayout(4, 1));
		jp_east.add((jbtn_new));
		jp_east.add((jbtn_dap));
		jp_east.add((jbtn_clear));
		jp_east.add((jbtn_exit));
		jta_display.setFont(f);
		jta_display.setBackground(new Color(225, 225, 200));
		jta_display.setForeground(new Color(57, 109, 165));

		jf.setJMenuBar(jmb);
		jtf_user.setBackground(new Color(225, 225, 200));
		jp_center.setBackground(Color.green);
		jp_east.setBackground(Color.black);
		// 이스트 속지에 붙일
		jp_center.setLayout(new BorderLayout(0, 10));// 동서남북으로 레이아웃을 배치할수 있다.
		jp_center.add("Center", jsp_display);
		jp_center.add("South", jtf_user);
		jta_display.setLineWrap(true);
		jf.setLayout(new BorderLayout(10, 20)); // 간격 벌리기
		jf.add("North", toolbar);
		jf.add("Center", jp_center);
		jf.add("East", jp_east);
		jf.setTitle("야구 숫자 게임 ver1.0");
		jf.setSize(400, 300);
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		BaseBallGame bbGame = new BaseBallGame();
		bbGame.initDisplay();
		bbGame.rancom();// 컴퓨터가 채번한 숫자가 채워짐 채워지기 전 000이다.
	}

	///////// jtf_user에 엔터를 쳤을 때, jbtn_exit버튼을 클릭했을때 이벤트 지원하는 인터페이스가
	///////// ActionListener이다
	/// ActionListener는 반드시 actionPerformed를 재정의 해야 한다
	// annotation-->부모가 가진 메소드를 재정의 하였따는 의미
	/// 콜백메소드는 개발자가 호출할 수 없는 메서드로 시스템 레벨에서 필요할때 자동으로 호출됨.
	// 자바에 main메소드도 일종의 콜백 메소드임..........
	@Override
	public void actionPerformed(ActionEvent e) {
		// BaseBallGame exitbtn = new BaseBallGame();
		// exit();
		// System.out.println("actionPerformed 호출성공");
		String label = e.getActionCommand();
		// System.out.println("너가 누른 버튼의 문자열은 "+label+ "입니다");

		Object obj = e.getSource();// 이벤트 소스의 주소번지를 담아줌

		if ("나가기".equals(label)) {
			exit();// 메소드 호출하기
		}
//		if (obj == jbtn_exit || obj == jmi_exit) { // 156번 ~159번줄 기능이랑 같음 나가기 버튼
//			System.out.println("게임 나가기.");
//
//			exit(); // 나가기 (종료)
//		}

		else if (label.contentEquals("새게임")) {
			System.out.println("새로 게임을 시작합니다.");
		} else if (label.contentEquals("정답")) {
			System.out.println("문제의 답을 맞추셨습니다.");
		} else if (label.contentEquals("지우기")) {
			System.out.println("지우기.");
		} // else if (label.contentEquals("나가기")) {
			// System.out.println("게임 나가기.");
			// exit(); // 메소드 호출하기,
			// }
			// 너 나가기 버튼이니?
		if (e.getSource() == jtf_user) {
			// jta_display.append(jtf_user.getText() + "\n");
			jta_display.append(++cnt + "회차." + jtf_user.getText() + " : " + account(jtf_user.getText()) + "\n");
			jtf_user.setText("");
		}

		else if (obj == jbtn_dap) {
			jta_display.append("정답은" + com[0] + com[1] + com[2] + "\n");
			// rancom();
			// jtf_user.requestFocus();
		} else if (obj == jbtn_new) {
			cnt = 0;
			rancom();
			jta_display.setText("");
			jtf_user.setText("");
			// 포커스를 jtf_user에
			jtf_user.requestFocus();
		}

	}

}
