package book.ch2;

public class P77_1 {

	public static void main(String[] args) {
//		int x = 1;
//		int y =2;
//		if((++x<y)&(x>y--)) //(2<2)&(2>2) �� ���й������� ���� xy���� �ڹ����� �־���Ѵ� y-- ���̳ʽ��� �ε�ȣ �Ŀ�..... ����
//		{
//			System.out.println("���϶�");
//		}
//		else 
//		{
//			System.out.println("�����϶�");
//		}
//		x=1;
//		y=2;
//		if((++x<y)&&(x>y--)) //2<2&&1>1
//		{
//			System.out.println("���϶�");
//		}
//		else
//		{
//			System.out.println("�����϶�");
//		}
		
		int x = 1;
		int y =2;
		if((++x<y)|(x>y--)) //(2<2)&(2>2) �� ���й������� ���� xy���� �ڹ����� �־���Ѵ� y-- ���̳ʽ��� �ε�ȣ �Ŀ�..... ����
		{
			System.out.println("���϶�");
		}
		else 
		{
			System.out.println("�����϶�");
		}
		x=1;
		y=2;
		if((++x<y)||(x>y--)) //2<2&&1>1
		{
			System.out.println("���϶�");
		}
		else
		{
			System.out.println("�����϶�");
		}
	}

}
