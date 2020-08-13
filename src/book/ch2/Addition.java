package book.ch2;

import javax.swing.JOptionPane;

//non-static������ �޼ҵ�� static�������� ����Ҽ�  ����

public class Addition {

	public static void main(String[] args) {
		//����ڿ� ���� ù��° ���ڿ� �Է�
		String firstNumber = "5";
		firstNumber = JOptionPane.showInputDialog("ù��° ���� �Է��ϼ���.");
		//����ڿ� ���� �ι�° ���ڿ� �Է�
		String secondNumber = "10";
		int number1;//ù��° ���� �߰�
		int number2;//�ι�° ���� �߰�
		int sum;//number1�� number2 ���ϱ�
		//����� ��Ʈ������ ���� ù��° ���� �б�
//		? = Integer.parseInt(firstNumber);//parseInt�� ���ڸ� �;��Ѵ� //���ڰ� ���� ���࿡���� ��
//		System.out.println(firstNumber + 5); //55�� ������������ �����̾ƴ϶� �ٿ����°Ŵ�.
		number1 = Integer.parseInt(firstNumber);
		number2 = Integer.parseInt(secondNumber);
		sum = number1 + number2;
		System.out.print(sum);
		//����� ��Ÿ����
		JOptionPane.showMessageDialog(null, "the sum si" + sum , "tg" , JOptionPane.showInternalConfirmDialog(null, sum));
		
	}

}
