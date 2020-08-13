package book.ch2;

/*
 * 대입연산자 오른쪽에 있는 값을 왼쪽에 대입한다.
 * 주의사항
 * 작은 값을 더 큰타입에 대입하는 건 합법
 * 그러나 큰 타입을 작은 타입의 변수에 대입하는건 불법임
 * 내 논리로 이해가 안되면 질문하세요
 * 내 논리로 이해가 된게 아니라면 내꺼가 아닙니다.
 */
public class D {

	public static void main(String[] args) {
		int i = 1;
		double d = i;
//		i = d; //불가능 큰타입을 작은타입에 넣는것은 불가능
		i = (int) d; // 강제 형전환
		float f = 1.5f;
		i = (int) f;
		float f1 = (float) d;
		System.out.println("f1: " + f1);
	}

}
