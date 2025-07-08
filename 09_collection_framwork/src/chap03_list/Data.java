package chap03_list;

/*
 *  <Comparable> 인터페이스
 *  
 *  1. Functional Interface입니다. ( 추상 메소드가 1개입니다. )
 *  2. 정렬이 필요한 객체들은 <Comparable> 인터페이스의 구현클래스 객체여야 합니다.
 *  3. 추상 메소드
 *     1)int compareTo( T t );
 *     2)결과가 음수이면 현재 객체를 t앞에 두고, 양수이면 현재 객체를 t뒤에 둡니다.
 *     
 */

public class Data implements Comparable<Data>{
	
	private int item;
	
	public Data(int item) {
		this.item = item;
	}

	@Override
	public int compareTo(Data o) {
		// TODO Auto-generated method stub
		return item - o.item;  // 현재 객체의 item이 크면 양수를 반환하므로, 현재 객체를 Data o 앞에 둡니다.
	}                          // 현재 객체의 item이 작으면 음수를 반환하므로, 현개 객체를 Data o 앞에 둡니다.
	
	@Override
	public String toString() {
		return item +"";
	}

}
