package chap09_interface.d_extends_implements;

public class JejuTour extends Domestic implements Trip{

	@Override
	public void sightseeing() {
		// TODO Auto-generated method stub
		System.out.println("우도");
	}

	@Override
	public void foodTrip() {
		// TODO Auto-generated method stub
		System.out.println("전복");
	}
 
	
	
}
