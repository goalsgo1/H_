package book.ch2;

import javax.swing.JFrame;
//�� ���α׷��� ���ڰ��⸦ ������ ���Դϴ�.
//��Ģ������ ������
public class MyCalc {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		int width = 300; //���� �ʱⰪ
		width = 600;// �ʱ�ȭ
		int height = 400; //���� �ʱⰪ
		jf.setSize(width, height);//ȭ���� ũ�⸦ �������ִ� �޼ҵ�   jf�� �ּҹ���... setSize�� �޼ҵ� ���� jf�ǰ�
		//���ڰ����� ����ʹ�.... string����
		String title = "���ڰ���";
		title = "īī����";
		jf.setTitle(title); //
		boolean isOk = true;
		jf.setVisible(isOk); //ȭ���� �����ִ� �޼ҵ� �����ִ�? true //��ȭ�� ������ false
	}/////////end of main
}/////////////end of MyCalc
