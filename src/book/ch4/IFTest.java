package book.ch4;

import javax.swing.JOptionPane;

//��� Ŭ������ object�� ���� ��ӹ޾Ƽ� ����� �� ���̴�.
public class IFTest {

	public static void main(String[] args) {
		// ����ڷ� ���� ������ �Է¹޴´�.
		// ����ڰ� �Է��� ������ ���� ������ �����ϼ���.
		// ����ڰ� �Է��� ���� �޴� ����� �����Դϱ�?
		// �� �װ��� �޾����� Ÿ���� ����?
		String i = JOptionPane.showInputDialog("������ �Է��ϰ� ����ġ��");
//		System.out.print("�Է��� ����" + i);
		int i_jumsu = Integer.parseInt(i);
		if (i_jumsu >= 90) { // if�ȿ��� �������� �ְ����ΰ� �;��Ѵ�/?
			System.out.print("����� A������ �޾ҽ��ϴ�.");
		} else if (i_jumsu < 90 && i_jumsu >= 80) { //&&�� �տ��� �ȸ����� �ڿ��� ���ʿ�x ������
			System.out.print("����� B������ �޾ҽ��ϴ�.");
		} else if (i_jumsu < 80 && i_jumsu >= 70) {
			System.out.print("����� C������ �޾ҽ��ϴ�.");
		} else if (i_jumsu < 70 && i_jumsu >= 60) {
			System.out.print("����� D������ �޾ҽ��ϴ�.");
		} else {
			System.out.print("����� F������ �޾ҽ��ϴ�.");
		}
	}
}
