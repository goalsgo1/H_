package oracle.db;

public class StringTest {

	public static void main(String[] args) {
		String msg = "hello";  //String은 "hello" 덩어리로 저장되어 있다.
//		msg.replace('e', 'o'); //알파벳 e를 알파벳 o로 바꾸다=>replace
		msg = msg.replace('e', 'o'); //알파벳 e를 알파벳 o로 바꾸다=>replace //대입연산자를써야된다.
		System.out.println(msg);
		StringBuilder sb = new StringBuilder("hello"); //StringBuilder는 내부적으로 h,e,l,l,o 나눠서 저장한다.
		//나눠서 더한다.
		//string을 더할때는 stringbuilder을 써야한다. 
		sb.append(" world!!!");
		System.out.println(sb.toString()); 
		String str = "hello";
		str = str+" world"; 
		str+=" java";
		System.out.println(str);

	}

}
