package oracle.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionMgr {
	public static final String _DRIVER = "oracle.jdbc.driver.OracleDriver"; //ClassNotFoundException //오라클 폴더밑에 jdbc라는 폴더가 있고
	//driver 밑에 oracleDriver.class라는 클래스가 있다. //7번라인은 변하지 않는다. 업그레이드는 되는데 와꾸는 안바뀐다.(<- 표준 - 약속을 준수하고 있다.)
	public static final String _URL = "jdbc:oracle:thin:@192.168.0.211:1522:orcl11"; //URL안에는 IP주소가 있다 => 다른 컴퓨터에 접속하기 위해서...
	public static String _USER = "scott"; //10번 11번은 한달에 한번씩 바꾼다 =>보안때문에...
	public static String _PW = "tiger";  //10번 11번은 한달에 한번씩 바꾼다 =>보안때문에...
	public Connection con = null; //
	//물리적을 떨어져 있는 오라클 서버와 연결통로 만들기.
	public Connection getConnection() { //빨간줄. .. Connection con을 전역변수로 선언해야 한다.
		try { //예외처리를 하였다. //네이버 찾을때 예외처리 또는 트라이 캐치  //예외처리를 하였다.실행시에 에러 발생할 가능성이 있는 코드 try..catch안에 써준다.
			Class.forName(_DRIVER); // 제조회사를 알아야한다. 그래야 제조를 잘할수 있다.
			con = DriverManager.getConnection(_URL, _USER, _PW); ///여기서 연결통로를 학정 ..getConnection에는 정보가 3개 필요하다.. methodoverloading
			//con = DriverManager.get //ctrl + enter 필요한 정보가 나온다.
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 클래스를 찾을 수 없습니다.");
		} catch (Exception e) {
			//연결 통로를 찾는 일인데 위에 catch는 찾을수 없었을때 나타낼 문구를 프린트 하는데 
			//두번째 catch는 찾을수 없었을때 더 상위 클래스로 이동하는.......
			System.out.println("연결실패!!!." +e.toString()); //연결실패 후 실패의 원인에 대한 힌트를 얻기 위해 ..........?
		}
		return con;
//		return null //NullPointerException(이라는 에러가 꼭 난다. 기억할것)(인스턴스화 문제로 발생한다)(/////////////중요 이 에러 잡기 쉽지않다./////)
	}
	public static void main(String args[]) {    //단위 테스트 ..
		DBConnectionMgr dBMgr = new DBConnectionMgr();
		dBMgr.con = dBMgr.getConnection(); //27번이 null이 발생하면 31번줄도 null이 되어서 에러가 발생한다...//////////중요///////////
		System.out.println("con===========>"+dBMgr.con);
	}
}
