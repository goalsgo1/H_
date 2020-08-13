package book.ch5;
//실력에 차이가 들어나는걸 싫어합니다.
//틀을 짜두고 그 틀에 업무에 대한 코딩만 하게 한다. 예)게임엔진
public class DeptVO {

	private int deptno = 0; //private 을 주는게 보안에 좋다 (접근제한자)
	private String dname = null;
	private String loc = null;
	public DeptVO() {}
	public DeptVO(int deptno,String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;

	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}

}
