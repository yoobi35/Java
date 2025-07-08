package chap10_anonymous_object;


/*
 * 클래스를 이용한 익명 객체(Anonymous Object)
 * 
 * 1. 클래스를 상속해서 이름 없는 서브클래스를 즉석에서 선언하고 객체로 생성하는 방법
 * 2. 한 번만 사용할 목적의 임시객체가 필요할 때 유용합니다.
 * 3. 문법
 *     슈퍼클래스 참조변수 = new 슈퍼클래스 (매개변수, ...) {
 *     @Override   // 필요시 진행합니다.
 *     void method(){...}
 *     }
 */



/* 
 *  인터페이스를 이용한 익명 객체 (Anonymous Object)
 *  
 *  1. 인터페이스(또는 추상클래스)를 구현할 때 (상속할 때) 구현클래스(서브클래스)를 즉석에서 선언하고 객체로 생성하는 방법입니다.
 *  2. 대표적으로 이벤트 처리와 같이 한 번만 처리하는 작업에서 많이 활용됩니다.
 *  3. 문법 
 *  
 */

public class Main {

	public static void main(String[] args) {
		

		
		// 서브 클래스 Chihuahua 없이 chihuahua 객체 만들기
		
		Dog chihuahua = new Dog() {
			@Override
			public void bark() {
				System.out.println("앙앙앙");
			}
		};
		chihuahua.bark();
		
		
		
		// 구현 클래스 ConfirmButton 없이 confirmButton 객체 만들기
		Button confirmButton = new Button() {
			@Override
			public void onClick() {
				System.out.println("메인페이지로 이동합니다");
			}
		};
		confirmButton.onClick();
		
		
		// -------------- 메소드에 익명 객체를 인자로 전달하기 
		WebService.createPost(new Button() {
			@Override
			public void onClick(){
				System.out.println("게시글 작성 후 게시글 목록 페이지로 이동");
			}
		});
		
		
		
	}
}
