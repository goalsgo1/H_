package oracle.db;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import book.ch5.DeptVO;

/*
 * 생성자 안에서도 메소드 호출 가능
 * 변수 선언도 가능함
 * 내안에 있는 메소드를 호출하는 거니까 인스턴스화는 필요없다.
 * 생성자 앞에는 static이 없다.
 * non-static에서 non-static 접근이 가능하고
 * static에서 non-static은 반드시 인스턴스화
 */
public class DeptApp extends JFrame implements ActionListener, MouseListener {
	JMenuBar jmb = new JMenuBar();

	JMenu jm_db = new JMenu("오라클 연계");
	JMenuItem jmi_con = new JMenuItem("오라클 연결");
	JMenuItem jmi_sel = new JMenuItem("조회");
	JMenuItem jmi_ins = new JMenuItem("등록");
	JMenuItem jmi_upd = new JMenuItem("수정");
	JMenuItem jmi_del = new JMenuItem("삭제");
	JMenuItem jmi_exit = new JMenuItem("나가기");
	// 양식, 폼을 그려주는 클래스임.
	JTable jt_dept = null;
	// JTable에 스크롤바를 붙여줄 속지임.
	JScrollPane jsp_dept = null;
	String cols[] = { "부서번호", "부서명", "지역" };
//	String data[][] = new String[5][3]; // 2차배열은 for문이 두개 와야 한다. [5]는 ROW값
	String data[][] = new String[0][3];
	DefaultTableModel dtm = null;
	DBConnectionMgr dbMgr = new DBConnectionMgr();
	Connection con = null;
	PreparedStatement pstmt = null;// 오라클 서버에 셀렉트문을 가져가고 요청한후 결과를 받아오는 역할
	ResultSet rs = null; // 네이버에 뭘 쳤다 ? 셀렉트 .. , 배송조회를 한다??? 셀렉트.. 조회하는것?......... ====>오라클에 살고있는 일꾼이
							// 있다.->옵티마이져

	public DeptApp() {
		initDisplay();
	}

	public void initDisplay() {
		dtm = new DefaultTableModel(data, cols);
		jt_dept = new JTable(dtm);
		jt_dept.addMouseListener(this);
		jsp_dept = new JScrollPane(jt_dept, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jmi_sel.addActionListener(this);
		jm_db.add(jmi_sel);
		jm_db.add(jmi_ins);
		jm_db.add(jmi_upd);
		jm_db.add(jmi_del);
		jm_db.add(jmi_exit);
		jmb.add(jm_db);
		this.add("Center", jsp_dept);
		this.setJMenuBar(jmb);
		this.setSize(450, 320);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new DeptApp();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String label = e.getActionCommand(); // 문자열 라벨 가져오기
		// 너 조회버튼 누른거야?
		if ("조회".equals(label)) {
			System.out.println("조회버튼 클릭 성공");
			String sql2 = "SELECT deptno, dname, loc FROM dept";
				   sql2 += " WHERE deptno >=?";
				   sql2 += " OR loc LIKE ?||%"; //+붙어야함 //스트링은 원본이 바뀌지 않으니까 +(대입연산자를) 붙여야 한다.
			StringBuilder sql = new StringBuilder(); 
			sql.append("SELECT deptno, dname, loc FROM dept");
			sql.append( " WHERE deptno >=?                 ");
			sql.append( " OR loc LIKE ?                    ");
			try {
				con = dbMgr.getConnection();
//				con = null; 이렇게 치면 nullPoninterException이라는 에러가 나온다
				pstmt = con.prepareStatement(sql.toString()); // 오라클하고 만나는 자리.... //메모리에 로딩 성공
				pstmt.setInt(1, 30); // 91번 물음표에 들어갈 내용
				pstmt.setString(2, "N%");
				rs = pstmt.executeQuery(); // executeQuery();는 rs(ResultSet)으로 받는다.
				DeptVO dvo = null;
//				DeptVO[] dvos = new DeptVO[4];
				DeptVO[] dvos = null; //몇건이 있는지 알수 없으니까 일단 null로 해두었다가 생성해야 할꺼같다 ..ㅜㅜ
				Vector rv = new Vector(); //몇건이 있는지는 오라클에게 물어봐야 하니까 물어본 결과를 그때 그때 기억해 두어야 해
				int i = 0;
				while (rs.next()) {
					dvo = new DeptVO();
					System.out.println(rs.getInt("deptno") + ", " + rs.getString("dname") + ", " + rs.getString("loc"));
					//dvo.setDeptno(rs.getInt(1)); //105~107줄이랑 같지만 숫자로 하면 직관적이지 않아서 하면 안된다.(불편하다?,다른사람이 못찾는다)
					//dvo.setDeptno(rs.getInt(2));
					//dvo.setDeptno(rs.getInt(3));
					dvo.setDeptno(rs.getInt("deptno"));
					dvo.setDname(rs.getString("dname"));
					dvo.setLoc(rs.getString("loc"));
//					dvos[i] = dvo;
					rv.add(dvo); //오라클에서 얻어낸 정보를 그때 그때 기억하는 문장임.
					i = i + 1;
				}
				// 화면에 출력하기
				dvos = new DeptVO[rv.size()];//이제는 결정할 수 있겠는데 왜냐하면 Vector의 size()를 호출하면 로우수를 알수 있으니
				rv.copyInto(dvos); //Vector에 담긴 정보를 객체 배열에 똑같이 복사해 주시
				for (int j = 0; j < dvos.length; j++) {
					DeptVO rdvo = dvos[j]; // result dvo => rdvo //변수이름은 중복되면 안되기 때문
					System.out.println(rdvo.getDeptno() + ", " + rdvo.getDname() + ", " + rdvo.getLoc());

					Vector oneRow = new Vector<>();
					oneRow.add(rdvo.getDeptno());
					oneRow.add(rdvo.getDname());
					oneRow.add(rdvo.getLoc());
					
					dtm.addRow(oneRow); //화면 출력.

//					oneRow.add(10);
//					oneRow.add("ACCOUNTING");
//					oneRow.add("서울");
//					dtm.addRow(oneRow); //벡터가 가리키는 주소번지 =>oneRow
				}

			} catch (SQLException e2) {
				System.out.println("e2 SQLException:" + e2.toString());
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) { //마우스 이벤트가 감지되었을때.
		// TODO Auto-generated method stub
		if (e.getClickCount()== 2) { //더블클릭에 대한 메소드
			System.out.println("더블 클릭 한거야");
		}
	}

	@Override//인터페이스가 반드시 구현해야하는 목록 /////////Override가 만들어준 목록중 하나라도 생기면 문법 에러가 생김.
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
