package book.ch2;

import javax.swing.JOptionPane;

public class Quiz5 {
//���� �߷��� ������ 17%�� �Ұ��մϴ�
	// �������� �����԰� 100kg �� ����� �޿� ���� 17kg�ۿ� �ȵ˴ϴ�.
	// ������ N�� �Ǽ��̰� Ű����� ���� �Է� �޽��ϴ�
	// ��°��:
	// ����������:100kg
	// �޸�����:17kg
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("���� �����Ը� ġ�� ����ġ��");
		System.out.println("���� ������ " + s + "kg");
		double ew = Integer.parseInt(s);
		double mw = ew * 17 / 100;
		System.out.print("�� ������ " + mw + "kg");
	}

}
