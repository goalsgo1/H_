package book.ch2;

import javax.swing.JOptionPane;

public class C {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("첫번째 숫자를 입력하고 엔터치기");
		System.out.println("첫번째 숫자" + s);
		String s2 = JOptionPane.showInputDialog("두번째 숫자를 입력하고 엔터치기");
		System.out.println("두번째 숫자" + s2);
		
//		System.out.println("s"+"s2");
		int firstnumber = Integer.parseInt(s);
		int secondnumber = Integer.parseInt(s2);
		int a = firstnumber + secondnumber;
		System.out.print("첫번째 숫자 + 두번째 숫자 =" + a);
		
	}

}
