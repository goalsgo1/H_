package book.ch2;

public class P49 {
	//���������� Ŭ���� �������� ����� �� �ִ�.
	int i; //�������� -heap[global variable, member variable, instance variable]
	public static void main(String[] args) {
		P49 p49 = new P49();
		p49.methodA();
		int i = 5; //�������� -stack[local variable, automatic variable]
		i = 10;
		p49.methodB(i);
		float f = 3.14f;
		double d = 3.1456;
		System.out.println(f);
		System.out.println(d);
		boolean isOK;//�ʱ�ȭ�� �ؾ���
		isOK= false; // �ʱ�ȭ
		System.out.print(isOK);
		
		
	}
	void methodA() {
		System.out.println("�������� i ==>"+i);
		//����: methodA���� 10������ ������ ���� i�� 10�� ����ϰ� ������.... �����Ѱ���?
	}
	void methodB(int i) { //�Ķ���Ϳ� ������ ������ �����̴�.
		System.out.println("�������� i��"+ i);
		
	}
}
//�ϰ���-���������� �ν��Ͻ� ������ ������ �Ұ���

//������������ �ν��Ͻ� ���� ��
//p49.i�� ������ �� �ִ� ����
