package book.ch2;

public class Variable1 {
	//에러에는 두 가지가 있다.
	//문법에러
	//런타임 에러(실행에러--문법에러는 없어요)
	public static void main(String[] args) {
		int i = 3; // 인는 정수만 들어와야 한다 
		System.out.println(3);
		System.out.println(i);
		String name = "KOSMO";
		name="IT사관학교";
		System.out.println("KOSMO");
		System.out.println("KOSMO");
		System.out.println("KOSMO");
		System.out.println("==============");
		System.out.println(name);
		System.out.println(name);
		System.out.println(name);
	} //변수를 사용하는 목적:일괄처리
}