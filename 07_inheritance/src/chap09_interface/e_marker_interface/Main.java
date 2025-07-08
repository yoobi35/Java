package chap09_interface.e_marker_interface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person person = new Person();
		
		Hamburger hamburger = new Hamburger();
		Sashimi sashimi= new Sashimi();
		BloodCakeSoup bloodCakeSoup = new BloodCakeSoup();
		
		
		
		// ---- 매개변수가 Food인 경우 모든 Food 구현체를 넣을 수 있습니다.
		person.eat(hamburger);
		person.eat(sashimi);
		person.eat(bloodCakeSoup);   // --- 컴파일 오류 만들기 
		
		// ---- 매개변수가 FavoriteFood인 경우 FavoriteFood 구현체만 넣을 수 있습니다.
		person.favoriteEat(sashimi);
		person.favoriteEat(hamburger);
	}

}

