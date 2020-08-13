package book.ch4;

public class Suffle {

	public static void main(String[] args) {
		int a = 10, b = 100, c = 500;
		int temp = 0;
		temp = a;
		a=b;
		b=c;
		c=temp;
		System.out.print("a===>"+a);
		System.out.print("b===>"+b);
		System.out.print("c===>"+c);
	}

}
