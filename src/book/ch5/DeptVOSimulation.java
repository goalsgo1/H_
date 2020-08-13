package book.ch5;

public class DeptVOSimulation {

	public static void main(String[] args) {
		DeptVO dVO = new DeptVO();
		DeptVO[] dVOS = new DeptVO[3]; /////
		dVO.setDeptno(10);
		dVO.setDname("ACCOUNTING"); //set  save하는것
		dVO.setLoc("NEW YORK");
		System.out.println(dVO.getDeptno());  //get 파라미터
		System.out.println(dVO.getDname());
		System.out.println(dVO.getLoc());
		dVOS[0] = dVO;
		dVO = new DeptVO();  //초기화
		dVO.setDeptno(20); //새로운 주소번지로 바뀐다. 변수이름은 같지만 주소번지는 다르다.
		dVO.setDname("RESEARCH");
		dVO.setLoc("DALLAS");
		System.out.println("=================================");
		System.out.println(dVO.getDeptno());
		System.out.println(dVO.getDname());
		System.out.println(dVO.getLoc());
		dVOS[1] = dVO;
		dVO = new DeptVO();
		dVO.setDeptno(30);
		dVO.setDname("SALES");
		dVO.setLoc("CHICAGO");
		dVOS[2] = dVO;
		System.out.println("=================================");
		System.out.println(dVO.getDeptno());
		System.out.println(dVO.getDname());
		System.out.println(dVO.getLoc());
		for (int i = 0; i < dVOS.length; i++) { //배열의 갯수니까 length는 3을 계산해준다.
			DeptVO rVO = dVOS[i];
			System.out.println(rVO.getDeptno()+","+rVO.getDname()+","+rVO.getLoc());
		}
	} //한번에 가로내용 한개씩밖에 담을수 없다 (장애) 이름이 3개면 3번 인스턴스화 이름이 천개면 1000번 인스턴스화
	  //배열을 써서 해결한다.

}
