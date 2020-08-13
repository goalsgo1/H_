package book.ch4;

import java.util.Scanner;

public class ScannerTest_dowhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num =1;
		do {
			System.out.println("숫자를 입력하시오.");
			String A = scan.nextLine();
			System.out.println("num"+A);
			num++;
		} while (num <3);
		
	}

}
