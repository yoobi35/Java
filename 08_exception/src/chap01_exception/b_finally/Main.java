package chap01_exception.b_finally;

import java.util.Arrays;

/*
 * finally 블록
 * 
 * 1. 예외 발생 여부와 상관 없이 향상 실행되는 코드를 작성합니다.
 * 2. 파일 열기, 데이터베이스 연결, 네트워크 소켓 연결 등 시스템 자원을 사용한 경우
 * 	  해당 자원을 finally 블록에서 닫거나 반환하는 것이 좋습니다.
 * 3. finally 블록에서도 예외가 발생할 수 있으므로, 필요한 경우 finally 블록 내부에 
 *    다른 try-catch 문을 사용할 수 있습니다.
 * 4. finally 블록에서 return을 사용하는 것을 권장하지 않습니다.
 *    이는 try블록이나 catch블록에서 처리한 return 또는 throw가 무시될 수 있기 떄문입니다.
 */

public class Main {

	public static void main(String[] args) {
		
		try {
			System.out.println("try블록입니다.");
			int[] numbers = new int[-5];  // -------------NegativeArraySizeException 예외 발생 (음수 크기의 배열 생성 시)
			System.out.println(Arrays.toString(numbers));
		} catch (Exception e) {
			System.out.println("catch 블록입니다.");
		} finally {
			System.out.println("항상 실행되는 finally 블록입니다.");
		}
		

	}

}
