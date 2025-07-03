package chap03_override;

/*
 * 메소드 오버라이드
 * 
 * 1. 슈퍼클래스의 메소드를 서브클래스가 다시 만드는 것을 의미합니다.
 * 2. 완전히 동일한 원형을 가지도록 다시 만들어야 합니다. (반환타입, 메소드명, 매개변수가 모드 동일해야합니다.)
 * 3. 오버라이드한 메소드는 @Override 어노테이션을 추가하는 것이 권장사항입니다.
 * 4. 접근 지시자의 경우 더 넓은 범위의 권한으로 바꾸는 것은 허용됩니다.( 대표적으로 슈퍼:protected, 서브 : public)
 */

public class Chihuahua extends Dog {
	
	@Override  // 어노테이션 = 자바에게 알려주기 위해서 쓰임
	public void bark() {
		System.out.println("앙앙앙!");
	}
	
	

	
}
