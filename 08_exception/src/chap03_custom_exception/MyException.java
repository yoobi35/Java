package chap03_custom_exception;

import java.io.Serial;

/*
 *  사용자 예외 클래스
 *  
 *  1. 기존에 만들어져 있는 예외 클래스를 사용하지 않고,새로운 예외 클래스를 직접 만들어 사용할 수 있습니다.
 *  2. 기존 예외 클래스로 처리하기 어려운 상황을 처리할떄 사용합니다.
 *  3. 생성 방법
 *     1) java.lang.Exception 클래스를 상속 받는 클래스를 만듭니다.
 *     2) 예외 클래스는 다른 곳으로 전송이 가능한 직렬화(Serializable) 객체리므로 serialVersionUID 값을 생성하길 권장합니다.
 *     3) 예외 클래스 이름이 Exception 으로 끝나도록 합니다. 
 */
public class MyException extends Exception {

	@Serial     // @java.io.Serial   = import java.io.Serial; 생략하고 쓸 수 있음
	private static final long serialVersionUID = 6836813439025494565L;
	
	public MyException(String message) {
		super(message);   // -----Exception의 생성자를 호출하며 예외 메시지(String message)를 전달합니다.
	}

}
