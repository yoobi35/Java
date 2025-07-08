package chap09_interface.e_marker_interface;

public class Sashimi implements Food , FavoriteFood {

	@Override
	public void howToEat() {
		// TODO Auto-generated method stub
		System.out.println("회는 와시비, 간장에 찍어서 먹습니다.");
	}
}
