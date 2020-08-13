package book.ch4;

public class Test1 {
	int g_i;

	void methodA() {
		int a_i;
		a_i = 1;
		g_i++;
	}

	void methodB() {
		g_i = g_i + 5;
	}

	public static void main(String[] args) {
		Test1 a = new Test1();
		a.methodA();
		System.out.println(a.g_i);/// g_i = 1 1번
		a.methodB();
		System.out.println(a.g_i);/// g_i = 6 2번
		Test1 a2 = new Test1();
		a2.methodA();
		System.out.println(a2.g_i);/// g_i = 1 3번
		
		//1번과 2번이 1과 6이 나온 상태에서 3번이 1이 나온 이유는
		//아무리 줄층이 먼저 왔다 하더라도 함수 호출 과정에서
		//a.methodA(); 와  a2.methodB();의 주소번지가 다르기 때문에...
		//타입은 같아도 둘의 관계가 없다.
	}

}
