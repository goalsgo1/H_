package report.ch4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RandomGame {

	public static void main(String[] args) throws IOException {
		Random r = new Random();
		int dap = r.nextInt(10);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("0부터 9사이의 숫자를 하나 입력하세요.");
		String str = null;
		while ((str = br.readLine()) != null) {
			System.out.println("사용자가 입력한 값 ===>" + str);
			if (Integer.parseInt(str) == dap) {
				System.out.print("정답입니다");
				break;
			} else if (Integer.parseInt(str) > dap) {
				System.out.println("낮춰라");
			} else if (Integer.parseInt(str) < dap) {
				System.out.println("높여라");
			}
			if ("q".contentEquals(str)) {
				System.out.println("프로그램을 종료합니다");
				break; //while을 종료
			}
		}

//		Random r = new Random();
//		boolean isStop = false;
//		int i = 1; // 반복문을 빠져나가기 위해 1번
//		while(true) { // boolean을 안하면 컴터 꺼야할수도 무한루프
//			int num = r.nextInt(10);
//			System.out.println(num);
//			if(i > 5) { // 반복문을 빠져나가기 위해 2번
//				break; 
//			}
//			i++; // i 증가 바퀴수 증가 4가 되면 break
//		}
	}

}
