package book.ch5;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ObjectArray extends JFrame { /////////객체배열
	JButton jbtns[] = new JButton[10]; // 객체배열
	
	int nums[] = {0,1,2,3,4,5,6,7,8,9,};
	public ObjectArray() {
		initDisplay();
	}
	public void initDisplay() {
		this.setLayout(new GridLayout(1,10));
		for (int i = 0; i < jbtns.length; i++) { ////핵심내용
			jbtns[i] = new JButton(nums[i]+"");	//핵심
			this.add(jbtns[i]);					//핵심
		}										////핵심내용
		this.setSize(600,200);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new ObjectArray();
	}

}
