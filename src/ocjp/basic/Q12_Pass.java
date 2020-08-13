package ocjp.basic;

public class Q12_Pass {
	int x = 0;
	public static void main(String[] args) {
		int x = 5;
//		Q12_Pass p = null; ///선언만 되었다.. - 이 주소번지를 사용하면 NullPointerExcepttion이 발생 - Runtime에러라고 함
		Q12_Pass p = new Q12_Pass();
		p.doStuff(p); //x는 5인데 x를 넘긴다.     //////////////////////////////////////////////////////////////////////////////////////////////////////점심시간
		System.out.print("  main x = " + x);

	}/////////////////end of main


	

	void doStuff(int x) {
//		System.out.print("  doStuff x = " + x++); //x는 5이고 ++는 나중에 찍히는것이기떄문에 x는 5이다
//		System.out.print("  doStuff x = " + this.x); //x는 5이고 ++는 나중에 찍히는것이기떄문에 x는 5이다
	} //////////end of dostuff
	
	
	void doStuff(Q12_Pass p) {  //앞에 괄호가 메소드 오버 로딩
//		System.out.print("  doStuff x = " + x++); //x는 5이고 ++는 나중에 찍히는것이기떄문에 x는 5이다
//		System.out.print("  doStuff x = " + this.x); //x는 5이고 ++는 나중에 찍히는것이기떄문에 x는 5이다
		System.out.print("  doStuff p = " + (p.x+2));
	} //////////end of dostuff

}////////////end of Q12_Pass
