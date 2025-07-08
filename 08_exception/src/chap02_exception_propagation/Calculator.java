package chap02_exception_propagation;

public class Calculator {
	
	public static double add(String x, String y) throws NumberFormatException{
		return Double.parseDouble(x)+Double.parseDouble(y);   // ---- java.lang.NumberFormatException
		                                                      // ---- unchecked이므로 예외처리 및 예외 위임 코드는 없어도 동작
	}
	
	public static double sub(String x, String y) throws NumberFormatException{
		return Double.parseDouble(x)-Double.parseDouble(y);
	}
	
	public static double mul(String x, String y) throws NumberFormatException{
		return Double.parseDouble(x)*Double.parseDouble(y);
	}
	
	public static double div(String x, String y) throws NumberFormatException {
		return Double.parseDouble(x)/Double.parseDouble(y);
	}

}
