package chap05_downcasting;

public class Chihuahua extends Dog {
	
	@Override  // 어노테이션 = 자바에게 알려주기 위해서 쓰임
	public void bark() {
		System.out.println("앙앙앙!");
	}
	
	public void getAngry() {
		System.out.println("치와와는 화를 잘냄");
	}
	

	
}