package book.ch2;

public class Parameter1 {
//	Parameter p2 = new Parameter(); //��������(����)
	//���� ���� ȣ���Դϴ�
	//�׷��� ���� x�� 10���� ����y��  20 ����.
	void methodA(int x, int y) {
		System.out.println("methodAȣ�⼺��");
//		p2.methodA(1,2);
		System.out.println(x+y);
	}
	//�޼ҵ� ������ �� ��ȯ Ÿ���� ������ �� �ִ�.
	//���� Ÿ���� �ִ� ��� ���๮ �� �������� �ݵ�� return�̶�� ����
	//���־�� �Ѵ�.
	//�̶� ���� �������� ���̳� Ȥ�� ���� ���� �� �� �ִ�.
	//�� ������ Ÿ���� ���� Ÿ�԰� �ݵ�� ��ġ�ؾ� ��.
	double methodB(double d1, double d2) { //���� (����) //���������� ���θ޼ҵ� �ȿ��� ����Ҽ� ����...
		double hap =0.0;
		hap = d1+d2;
		System.out.print(hap);
		return hap;
//		return 0;
	}
	
	public static void main(String[] args) {
		//RAM������ ParameterŬ������ �ε��ϱ�
		//p1�� ���������̴�.
		Parameter1 p1 = new Parameter1();
//		double hap = p1.methodA(10,20);
		double hap2 = p1.methodB(10,20); //methodB�� ����Ҽ� ������ methodA�� ���̵忩�� ����Ҽ� ����.
		System.out.print(hap2);
		
		
	}//A��� �޼ҵ��� ó�� �����.. �޼ҵ� B���� �����ϰ� ������ (�ι���� ������) ���ϻ���Ұ� --�ð��� �Ƴ��� �ִ�
	//����Ÿ���� ���̵���  ��� ����Ʈ �޼ҵ忡 ����Ҽ� ����.
	
	

}
