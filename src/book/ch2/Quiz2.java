package book.ch2;

public class Quiz2 {

	public static void main(String[] args) {
		int a = 1;//���� a�� 1�� ��Ҵ�
		int b = 2;//���� b�� 2�� ��Ҵ� 
		int c = 3;//���� c�� 3�� ��Ҵ�
		int tot = a+b+c;//����tot�� a+b+c�� ��Ҵ�.
		//���ڿ� ���ϱ�� ���ڿ��̴�.
		//���ڿ� +����=���ڿ�
		//���� +����=����
		//���� +���ڿ�=���ڿ�
		//���� ���ϱ� ���ڴ� �����̴�.
		System.out.println(a+"+"+b+"+"+c+"="+tot);
		System.out.println(a+"+"+b+"+"+c+"="+a+b+c);
		System.out.println(a+"+"+b+"+"+c+"="+(a+b+c));
		System.out.println("a+b*c====>"+(a+b*c));
		System.out.println("(a+b)*c===>"+((a+b)*c));
	}

}
