package ocjp.basic;
//배열의 시작 인덱스는 항상 0이다.
//이유는 a2의 주소번지와 a2의[0]의 주소번지가 같기 때문이야~~
public class IntArray {
	void a2Print(int[] a) {  //값에 의한 호출이 아니라 참조에 의한 호출
		for (int i = 0; i < 2; i++) { //배열의 크기가 2가 되고
			System.out.println(a[i]);  //0,1
		}
		//개선된 for문 //언제 쓰느냐 =>너가 가진거 다 보여줘(10개가 있으면 10개 다 찍어줘, 세개 있으면 세개 다 찍어줘)
		for(int b:a) {
			System.out.println(b);
		}
	}
	public static void main(String[] args) {
		int i,j = 0; //i는 선언만 했고 j는 초기화 했다. // 연속적으로 선언할수 있다.
		i = 2; // 선언만 했으니 
		System.out.print(i+","+j);
		int x[],y = 0; //y가 배열이 아니라 그냥 인트이고
//		int[]a, b= 0; //b는 배열 이라는 뜻이다 //배열괄호가 앞에 오는거랑 뒤에 오는거와의 차이
		int[]a2,b2;
		//선언시에는 대괄호를 반드시 붙이지만 생성시에는 생략함.
		//파라미터 자리에 배열을 넘길 수 있다. - 연습 - 클래스 활용
		a2 = new int[2]; // 0 0
		b2 = new int[3]; ///0 0 0
		//insert here
		IntArray ia = new IntArray();
		ia.a2Print(a2);
	}

}
