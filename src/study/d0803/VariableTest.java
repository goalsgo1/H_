package study.d0803;

public class VariableTest {
	// 사용자로 부터 세 개의 점수를 입력받는다 - 지역변수 자리이다
	// 초기화는 언제 이루어지나요? -when, where, what, how, why,
	
	int tot;

	/*
	 * @param jumsu1 - 90;
	 * @param jumsu2 - 85;
	 * @param jumsu4 - 95;
	 * @param inwon - 응시원수;
	 * 
	 * 
	 * 
	 */
	int hap(int jumsu1, int jumsu2, int jumsu3, int inwon) {
		System.out.println(jumsu1+""+jumsu2+""+jumsu3+"응시원수:"+inwon);
		double avg =(jumsu1+jumsu2+jumsu3)/(double)inwon;
		double avg2 =(jumsu1+jumsu2+jumsu3)/inwon;
		System.out.println("평균은 1:"+avg);
		System.out.println("평균은 2:"+avg2);
		return jumsu1+jumsu2+jumsu3;
	}

	public static void main(String[] args) {
		// 내가 가진 메소드 일지라도 static영역에서 호출할 때는
		// 반드시 인스턴스화를 할것.
		VariableTest vt= new VariableTest();
//		vt.jumsu1 = 0; //지변은 인스턴스 변수,변수이름으로 초기화 및 호출 불가함
		vt.tot = 10;
		vt.hap(90, 85, 95, 3); //값에 의한 호출이다. call by value
	}

}
