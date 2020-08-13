package book.ch2;

public class P77_1 {

	public static void main(String[] args) {
//		int x = 1;
//		int y =2;
//		if((++x<y)&(x>y--)) //(2<2)&(2>2) 앞 구분문제에서 나온 xy값을 뒤문제에 넣어야한다 y-- 마이너스는 부등호 후에..... 거짓
//		{
//			System.out.println("참일때");
//		}
//		else 
//		{
//			System.out.println("거짓일때");
//		}
//		x=1;
//		y=2;
//		if((++x<y)&&(x>y--)) //2<2&&1>1
//		{
//			System.out.println("참일때");
//		}
//		else
//		{
//			System.out.println("거짓일때");
//		}
		
		int x = 1;
		int y =2;
		if((++x<y)|(x>y--)) //(2<2)&(2>2) 앞 구분문제에서 나온 xy값을 뒤문제에 넣어야한다 y-- 마이너스는 부등호 후에..... 거짓
		{
			System.out.println("참일때");
		}
		else 
		{
			System.out.println("거짓일때");
		}
		x=1;
		y=2;
		if((++x<y)||(x>y--)) //2<2&&1>1
		{
			System.out.println("참일때");
		}
		else
		{
			System.out.println("거짓일때");
		}
	}

}
