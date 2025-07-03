package chap01_is_a;

public class Main {

	public static void main(String[] args) {
		
		// ---- Student
		Student student = new Student();
		student.eat();
		student.sleep();
		student.study();
		System.out.println();
		
		// ---- Worker
		Worker worker = new Worker();
		worker.startWork();
		worker.finishWork();
		System.out.println();
		
		// ---- Developer
		Developer developer = new Developer();
		developer.develop();
		developer.eat();
		developer.sleep();
		System.out.println();

		
		// ---- Designer
		Designer designer = new Designer();
		designer.startWork();
		designer.finishWork();
		designer.design();
		System.out.println();
	}
	
	

}
