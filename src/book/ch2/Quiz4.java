package book.ch2;

public class Quiz4 {

	public static void main(String[] args) {
		int tot = 0;//0���� �ʱ�ȭ �ؾ���
		int a = 1;
		for(int i=0;i<10;i=i+1) {
//			System.out.println(i);
			tot = tot + a;//tot=0+1, tot=1+1, tot=2+1 
//			System.out.println(tot+a);//1,3,6
//			System.out.println(tot);
			a = a + 1;
			System.out.println(i+1);//for�� ������
		}
		System.out.println(tot);
	}

}
