package book.ch5;

public class DataTest {
	void guguDanPrint() {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}
	}

	public static void main(String[] args) {
		int deptno1 = 10;
		int deptno2 = 20;
		int deptno3 = 30;
		int deptno4 = 40;
		int deptnos[] = new int [4];
		deptnos[0] = 10;
		deptnos[1] = 20;
		deptnos[2] = 30;
		deptnos[3] = 40;
		// 부서번호를 조회하는데 for문을 사용할수 있다.|없다.
		for (int x = 0; x < 4; x++) {
			System.out.println(deptno1);
			System.out.println(deptno2);
			System.out.println(deptno3);
			System.out.println(deptno4);
		}
		for (int y = 0; y < 4; y++) {
			System.out.println(deptnos[y]);
		}
	}

}
