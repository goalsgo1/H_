package book.ch2;

public class Sungjuk {
	
	/*홍길동 학생의 국어,수학,영어 점수를 파라미터로 받아옵니다.
	 * hap메소드를 설계할때 리턴타입을 int로 한 이유는 avg메소드에서 재사용하기 위함이다.
	 * @param jumsu1 = 75
	 * @param jumsu2 = 80
	 * @param jumsu3 = 90
	 * @return int
	 * 
	 * 
	 */
		int hap(int jumsu1, int jumsu2, int jumsu3) { //파라미터와 리턴타입을 활용할수 있다.
			return jumsu1+jumsu2+jumsu3;
		}
		double avg(int hap){ //소수점 나올 수 있으니 더블로 인트x
//			System.out.println(hap);;
			return 0.0;
		}
		
		public static void main(String[] args) {
			Sungjuk sj = new Sungjuk();
			sj.hap(75, 80, 90);
			
			int hap = sj.hap(75,80,90);
			System.out.println(sj.hap(75, 80, 90));
			sj.avg(hap);
			
//insert here
	}
}
