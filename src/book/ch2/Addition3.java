package book.ch2;

import javax.swing.JOptionPane;

public class Addition3 {

	public static void main(String[] args) {
		int x, y, z, result;
		String xVal, yVal, zVal;
		xVal = JOptionPane.showInputDialog("ù��° ���� �Է��ϼ���");
		yVal = JOptionPane.showInputDialog("�ι�° ���� �Է��ϼ���");
		zVal = JOptionPane.showInputDialog("����° ���� �Է��ϼ���");
		x = Integer.parseInt(xVal);
		y = Integer.parseInt(yVal);
		z = Integer.parseInt(zVal);
		result = x*y*z;
		System.out.println(result);
		//����� ��Ÿ����
		JOptionPane.showMessageDialog(null, "The result in" + result, "ó�����" , JOptionPane.INFORMATION_MESSAGE);
		//�ڹ� ���� �ӽŰ��� ������� �������.
		System.exit(0);
	}////////////////////////////end of main

}
