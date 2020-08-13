package book.ch4;

public class ArrayTest {

	public static void main(String[] args) {
		int is[] = new int[4]; //한번에 방이 세개가 생긴다.
		is[0] = 1;
		is[1] = 2;
		is[2] = 3;
		is[3] = 4;
		double ds[] = new double[1]; //방이 하나만 생긴다.
		for(int j=0;j<4;j++) { //0번째부터2번째 까지 3 번반복
			System.out.println(is[j]);
		}
		
	}

}
