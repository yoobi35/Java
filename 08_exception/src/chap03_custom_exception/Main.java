package chap03_custom_exception;

public class Main {

	public static void customException() throws MyException {  // ---- customException() 메소드를 호출한 곳으로 MyException예외 던기지
		
	  // MyException 발생 후 예외 위임
		throw new MyException("예외메시지입니다.");
	}
	
	
	public static void main(String[] args) {
		try {
			customException();
		} catch (Exception e) {
			System.out.println(e.getMessage())
			
			
			;
		}
	
	
	
    // JVM에게 예외 위임하기 (비추천)
	//public static void main(String[] args) throws MyException { // ---- main() 메소드를 호출한 곳으로 MyException예외 던기지
	//customException();	

	}

}
