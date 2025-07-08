package chap09_interface.c_multi_implements;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// ---- Camera 타입 :카메라 인터페이스의 메소드만 보입니다. Phone 인터페이스의 기능은 캐스팅해서 호출
		Camera galaxy = new SmartPhone();
		galaxy.picture();
		((Phone)galaxy).call();
		
		// ---- Phone 타입 : 폰 인터페이스의 메소드만 보입니다. 카메라 인터페이스의 기능은 캐스팅해서 호출
		Phone iPhone = new SmartPhone();
		((Camera)iPhone).picture();
		iPhone.call();
		
		
		// ---- SmartPhone 타입 : 스마트폰 클래스의 메소드가 모두 보입니다.
		
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.picture();
		smartPhone.call();
		
	}

}
