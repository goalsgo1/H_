package study.d0803;

public class VariableTest {
	// ����ڷ� ���� �� ���� ������ �Է¹޴´� - �������� �ڸ��̴�
	// �ʱ�ȭ�� ���� �̷��������? -when, where, what, how, why,
	
	int tot;

	/*
	 * @param jumsu1 - 90;
	 * @param jumsu2 - 85;
	 * @param jumsu4 - 95;
	 * @param inwon - ���ÿ���;
	 * 
	 * 
	 * 
	 */
	int hap(int jumsu1, int jumsu2, int jumsu3, int inwon) {
		System.out.println(jumsu1+""+jumsu2+""+jumsu3+"���ÿ���:"+inwon);
		double avg =(jumsu1+jumsu2+jumsu3)/(double)inwon;
		double avg2 =(jumsu1+jumsu2+jumsu3)/inwon;
		System.out.println("����� 1:"+avg);
		System.out.println("����� 2:"+avg2);
		return jumsu1+jumsu2+jumsu3;
	}

	public static void main(String[] args) {
		// ���� ���� �޼ҵ� ������ static�������� ȣ���� ����
		// �ݵ�� �ν��Ͻ�ȭ�� �Ұ�.
		VariableTest vt= new VariableTest();
//		vt.jumsu1 = 0; //������ �ν��Ͻ� ����,�����̸����� �ʱ�ȭ �� ȣ�� �Ұ���
		vt.tot = 10;
		vt.hap(90, 85, 95, 3); //���� ���� ȣ���̴�. call by value
	}

}
