package book.ch2;

public class E {

	public static void main(String[] args) {
		//�迭 �̸��� �ּҹ����� ù��° ���� �ּҹ����� ���� ���̹Ƿ�
		//���� Ÿ���� ���� ������ ���� �� �ִ� ���� args�� 0���� ����ϰ�
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		int j =0;
		System.out.println(args[j++]);
		System.out.println(args[j++]);
		System.out.println(args[j++]+10);
		
	}

}
