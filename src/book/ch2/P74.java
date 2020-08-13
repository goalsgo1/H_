package book.ch2;

public class P74 {

	public static void main(String[] args) {
//		int num = 2;
//		int val;
//		val = ++num;
//		val = num++;
		
//		val = --num;
//		val = num-num;
//		System.out.print(val);
		
//		int num0 = 1;
//		int num1 = 2;
//		int num2 = 3;
		
//		int val;
//		val = num0 + num1-- + num2;
//		System.out.println(val); 
//		System.out.println(val + "=" + num0 + "+" + num1 + "+" + num2);
		
		int x = 2;
		int y = 1;
		y =++x; //x는 증가 먼저 니까 3이되고 대입연산자니까 y도 3이 된다
		x=5;
		y=x--;
//		System.out.println(x);
//		System.out.println(y); 
		// x = 4 y = 5;
		x=y;
		y=x+y;
//		System.out.println("x =" + x);
//		System.out.println("y =" + y);
		
		x=0; //초기화
		y=1; //초기화
		x=--y;
//		y=++y;
		//x=0 y=1
//		System.out.println("x ="+ x);
//		System.out.println("y ="+ y);
		
		x=x-y;//x=-1 y=1
		y=x++;//x=0  y=-1
//		System.out.println("x ="+ x);
//		System.out.println("y ="+ y);
		x=0;
		y=-1;
		x=x-y++;//x=1 y=0
		y=--x;//x=0 y=0
		System.out.println("x ="+ x);
		System.out.println("y ="+ y);
		
		
	}

}
