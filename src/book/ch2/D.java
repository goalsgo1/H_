package book.ch2;

/*
 * ���Կ����� �����ʿ� �ִ� ���� ���ʿ� �����Ѵ�.
 * ���ǻ���
 * ���� ���� �� ūŸ�Կ� �����ϴ� �� �չ�
 * �׷��� ū Ÿ���� ���� Ÿ���� ������ �����ϴ°� �ҹ���
 * �� ���� ���ذ� �ȵǸ� �����ϼ���
 * �� ���� ���ذ� �Ȱ� �ƴ϶�� ������ �ƴմϴ�.
 */
public class D {

	public static void main(String[] args) {
		int i = 1;
		double d = i;
//		i = d; //�Ұ��� ūŸ���� ����Ÿ�Կ� �ִ°��� �Ұ���
		i = (int) d; // ���� ����ȯ
		float f = 1.5f;
		i = (int) f;
		float f1 = (float) d;
		System.out.println("f1: " + f1);
	}

}
