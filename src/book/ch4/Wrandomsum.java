package book.ch4;

import java.util.Random;

//10에서 -10사이의 정수 10개를 랜덤하게 채번하여 음수와 양수의 합계를 구하는 프로그램을 작성하시오

//채번된 값
// => 9,-2,-3,8,0,-3,-8,-6,-2,0

//음수의 합:-24
//양수의 합: 17
public class Wrandomsum {
	void P() {
		Random p = new Random();
		int pp = p.nextInt(10);
		System.out.println(pp);
		//Wrandomsum r = new Wrandomsum();
		
	}

	void M() {
		Random m = new Random();
		int mm = m.nextInt(10);
		System.out.println(-mm);
	}

	void PsMs(int ps) {
		
	}
	

	public static void main(String[] args) {
		Random a = new Random();
		Wrandomsum r = new Wrandomsum();
		for (int i = 0; i < 9; i++) {
			int b = a.nextInt(2);
			//System.out.println(b);
			if(b == 0) {
				r.P();
			}else {
				r.M();
			}
		}
	}
}//////////////////////////////////////스크립트 실패 -------->>Wrandomsum1.java로 가기
