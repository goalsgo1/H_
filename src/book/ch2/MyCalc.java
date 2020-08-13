package book.ch2;

import javax.swing.JFrame;
//이 프로그램은 전자계산기를 구현한 것입니다.
//사칙연산이 가능합
public class MyCalc {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		int width = 300; //가로 초기값
		width = 600;// 초기화
		int height = 400; //세로 초기값
		jf.setSize(width, height);//화면의 크기를 결정해주는 메소드   jf는 주소번지... setSize는 메소드 동사 jf의것
		//전자계산기라고 적고싶다.... string으로
		String title = "전자계산기";
		title = "카카오톡";
		jf.setTitle(title); //
		boolean isOk = true;
		jf.setVisible(isOk); //화면을 열어주는 메소드 열어주니? true //전화가 왔을땐 false
	}/////////end of main
}/////////////end of MyCalc
