package book.ch2;

public class Sungjuk {
	
	/*ȫ�浿 �л��� ����,����,���� ������ �Ķ���ͷ� �޾ƿɴϴ�.
	 * hap�޼ҵ带 �����Ҷ� ����Ÿ���� int�� �� ������ avg�޼ҵ忡�� �����ϱ� �����̴�.
	 * @param jumsu1 = 75
	 * @param jumsu2 = 80
	 * @param jumsu3 = 90
	 * @return int
	 * 
	 * 
	 */
		int hap(int jumsu1, int jumsu2, int jumsu3) { //�Ķ���Ϳ� ����Ÿ���� Ȱ���Ҽ� �ִ�.
			return jumsu1+jumsu2+jumsu3;
		}
		double avg(int hap){ //�Ҽ��� ���� �� ������ ����� ��Ʈx
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
