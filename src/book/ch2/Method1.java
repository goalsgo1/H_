package book.ch2;

public class Method1 {
	int i =3;
	void methodA() { //�޼ҵ带 ������ ���̴�.
		System.out.println("methodA ȣ�⼺"); // ���๮�̴�.
	}///////////////////end of methodA �ٽ� ���� �θ������� ���ư�
/*
 * 11-12-13-5-6-7-14 �̼������ �ڵ��� �ؾ� ������ �ȴ�. 	
 */	
	public static void main(String[] args) { //main method�� �־�� �ٸ�������� �Ұ����ټ� �ִ�.
		Method1 m1 = new Method1(); //�ν��Ͻ�ȭ�� �ϴ� ��   // m1:�ּ� ����
		m1.methodA(); //m1�ȿ� �ִ� �޼ҵ带 ȣ���Ͽ���. �����ݷ����� ������ ȣ���̴�.
		System.out.println("methodA ȣ�⼺��");
		
	}
} 
//�н���ǥ ���� Ŭ���� �ȿ� ������ �޼ҵ带 �����Ҽ� �ִ�. ��

