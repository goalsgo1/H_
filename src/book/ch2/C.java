package book.ch2;

import javax.swing.JOptionPane;

public class C {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("ù��° ���ڸ� �Է��ϰ� ����ġ��");
		System.out.println("ù��° ����" + s);
		String s2 = JOptionPane.showInputDialog("�ι�° ���ڸ� �Է��ϰ� ����ġ��");
		System.out.println("�ι�° ����" + s2);
		
//		System.out.println("s"+"s2");
		int firstnumber = Integer.parseInt(s);
		int secondnumber = Integer.parseInt(s2);
		int a = firstnumber + secondnumber;
		System.out.print("ù��° ���� + �ι�° ���� =" + a);
		
	}

}
