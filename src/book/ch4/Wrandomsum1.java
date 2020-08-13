package book.ch4;

import java.util.Random;

public class Wrandomsum1 {

	public static void main(String[] args) {
		int sum = 0;
		int msum = 0;
		for (int i = 0; i < 10; i++) {
			Random a = new Random();
			int aa = 0;
			aa = a.nextInt(2);
			if(aa == 0) {
				Random p = new Random();
				int pp = p.nextInt(10); 
				//System.out.println(pp);
				sum += pp;
			}else {
				Random m = new Random();
				int mm = m.nextInt(10); 
				//System.out.println(-mm);
				msum -= mm;
			}
			
			
			
		}
		System.out.println("양수의 합: "+sum);
		System.out.println("음수의 합: "+msum);
	}
}
