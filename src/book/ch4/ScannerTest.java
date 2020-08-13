package book.ch4;

import java.util.Scanner;
//모든 클래스는 object클래스를 상속 받고 있다.
//그래서 object에 정의한 메소드는 모두 내가 사용할수 있는 것임.
public class ScannerTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i=1;i<4;i++) {
			System.out.println("숫자를 입력하시오.");
			String num = scan.nextLine();
			System.out.println("num"+num);
		}
//		System.out.println("i="+i);
	}

}
