package game.baseball;

public class StringTest {

	public static void main(String[] args) {
		String s1 = new String("apple");
		String s2 = new String("apple");
		String s3 = "haha";
		//s1의 주소번지와 s2의 주소번지가 같니?
		System.out.println(s1==s2);//false가 출력된다
		//위의 문장은 주소번지가 같을 수가 없다//서로 다른풍선 타입이 같은거지 다른풍선이다 . 주소번지 다름
		//s1이 가리키는 문자열과 2가 가리키는 문자열이 같은거야?
		System.out.println(s1.contentEquals(s2));//true가 출력된다
	}

}
