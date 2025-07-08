package chap01_exception.d_checked;

import java.net.MalformedURLException;
import java.net.URL;

/*
 * Checked Exception
 * 
 * 1. 자바 컴파일러가 예외 처리를 강제하는 예외를 의미합니다.
 * 2. 자바 컴파일러가 예외 처리를 강제하기 떄문에 try-catch 문을 작성하거나, throws를 이용해 예외를 회피(전파, 위임)해야 실행할 수 있습니다.
 *    꼭 예외 처리가 필요한 이유?: 잠재적 오류를 사전에 방지하려는 자바의 예외 매커니즘 
 * 3. java.lang.Exception 클래스의 하위 클래스이지만, java.lang.RuntimeException 클래스의 하우 클래스는 아닙니다.
 * 4. 주로 외부 시스템과의 상호 작용(파일, 데이터베이스,네트워크 등)에서 발생할 수 있는 예외 상황에서 사용됩니다.
 * 5. 주요 Checked Exception
 * 	  1) IOException                               : 파일 입출력, 네트워크 입출력 등에서 발생
 *    2) ClassNotFoundException                    : 동적으로 클래스를 로드할 때 해당 클래스가 없는 경우 발생
 *    3) SQLException                              : 데이터베이스 작업 중 발생
 */

public class Main {

	public static void main(String[] args) {
		
		try {
			new URL("https://www.naver.com");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
