package chap03_casting;

public class PromationEX {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    
    /*
     * Promotion
     * 
     * 1. 데이터 타입 변환의 한 종류입니다.
     * 2. 별도 코드 없이 자동으로 수행하는 타입 변환입니다.
     * 3. 작은 데이터 타입을 큰 데이터 타입으로 자동 변환하는 과정을 의미합니다.(크기가 아닌 데이터 표현 범위가 기준) 
     * 4. 타입 변환 시 데이터 손실이 발생하지 않습니다.
     */
    
    // 예시 1) int  ->  long
    int i =10;
    long l = i;    // promotion (자동변환)
    double d = l;  // promotion (자동변환)
    
    System.out.println(i);
    System.out.println(l);
    System.out.println(d);
    
    char ch = 'a';
    int iNum =ch;
    System.out.println(ch);
    System.out.println(iNum);
  }

}
