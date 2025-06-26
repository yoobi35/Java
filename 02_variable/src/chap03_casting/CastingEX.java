package chap03_casting;

public class CastingEX {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    
    /*
     * Casting
     * 
     * 1. 데이터 타입 변환의 한 종류입니다.
     * 2. 개발자가 직접 변환할 타입을 명시하는 명시적 변환 과정을 의미합니다.
     * 3. 큰 데이터 타입을 작은 데이터 타입으로 자동 변환하는 과정을 의미합니다.(크기가 아닌 데이터 표현 범위가 기준) 
     * 4. 타입 변환 시 데이터 손실이 발생할 수 있습니다.
     */
    
    // 예시 1) int  ->  byte 변환
    int i = 256;       //  --------------  이진값 ( 비트값 ) : 1 0 0 0 0 0 0 0 0
    byte b = (byte)i;  //  -------Casting  이진값 ( 비트값 ) :   0 0 0 0 0 0 0 0
    
    System.out.println(i);
    System.out.println(b);
   
    // 예시 2) double  ->  long 변환
    double d = 1.9;
    long l = (long)d;   //  --------- Casting  (실수 -> 정수 변환 시 소수 아래는 모두 손실)
    System.out.println(d);
    System.out.println(l);
    
    // 예시 3) int  ->  char 변환
    int iNum = 48;         // ---------- 48 ('0') , 65('A') , 97('a')
    char ch = (char)iNum;  //  --------- Casting  (정수 -> 문자 변환 시 정수를 코드값으로 가지는 문자로 변환)
    System.out.println(iNum);
    System.out.println(ch);
  }

}
