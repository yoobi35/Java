package chap09_interface.b_extends;

public class Computer implements Computable{

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("전원On");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("전원Off");
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public int mod(int a, int b) {
		// TODO Auto-generated method stub
		return a%b;
	}

	
}
