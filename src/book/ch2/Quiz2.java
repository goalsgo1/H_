package book.ch2;

public class Quiz2 {

	public static void main(String[] args) {
		int a = 1;//정수 a에 1을 담았다
		int b = 2;//정수 b에 2를 담았다 
		int c = 3;//정수 c에 3을 담았다
		int tot = a+b+c;//정수tot에 a+b+c를 담았다.
		//문자열 더하기는 문자열이다.
		//문자열 +숫자=문자열
		//숫자 +숫자=숫자
		//숫자 +문자열=문자열
		//숫자 더하기 숫자는 숫자이다.
		System.out.println(a+"+"+b+"+"+c+"="+tot);
		System.out.println(a+"+"+b+"+"+c+"="+a+b+c);
		System.out.println(a+"+"+b+"+"+c+"="+(a+b+c));
		System.out.println("a+b*c====>"+(a+b*c));
		System.out.println("(a+b)*c===>"+((a+b)*c));
	}

}
