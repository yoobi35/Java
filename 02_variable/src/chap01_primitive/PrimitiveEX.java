package chap01_primitive;

public class PrimitiveEX {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    /*
     * Primitive Type
     * 1.기본 타입을 의미합니다.
     * 2.8가지 기본 타입이 있습니다.
     * 3.오직 값만 저장하는 타입입니다.
     * 4.객체와 구별하기 위한 데이터 타입입니다.
     */
    
    {
      // boolean 
      // 논리값 ( true 또는 false )
      // 1비트 (java 명세상)
      boolean a;
      a = true;
      System.out.println(a);
    }
    
    {
      // 비트와 바이트
      // 1. 비트 : 0 또는 1을 저장할 수 있는 최소 저장 단위
      // 2. 바이트 : 8비트 구성된 메모리의 최소 저장 단위
      
      // 비트에 따른 데이터 표현 개수
      // ex)
      // 2비트로 가능한 데이터 조합 : 00, 01, 10, 11 (4개)
      // 3비트로 가능한 데이터 조합 : 000, 001, 010, 011, 100, 101, 110, 111 (8개)
      // N비트로 가능한 데이터 조합 : 2의 N 제곱
      
      // 비트에 따른 데이터 표현 범위
      // 4비트로 가능한 데이터 범위 : -8 ~ 7
      // 8비트로 가능한 데이터 범위 : -128 ~ 127
      // N비트로 가능한 데이터 범위 : -2의 (N-1)제곱 ~ 2의 (N-1)제곱 -1 
    }
    
    {
      // 정수 타입
      //1. byte   : 1 바이트 ( -128 ~ 127 )
      //2. short  : 2 바이트 ( -32768 ~ 32767 )
      //3. int    : 4 바이트 
      //4. long   : 8 바이트
      byte a;
      short b;
      int c;
      long d;
      a=127; System.out.println(a);
      b=32767; System.out.println(b);
      c=Integer.MAX_VALUE; System.out.println(c);
      d=Long.MAX_VALUE; System.out.println(d);
      
      // long 타입 주의점 (int 범위를 벗어나는 값의  리터럴 작성 시 마지막에 l또는 L을 추가합니다.)
      d = 2147483648L;     System.out.println(d);
    }
    
    {
      //  실수 타입
      // 1.float   : 4바이트 ( 약 3.4e-38 ~ 3.4e+38 )
      // 2.double  : 8바이트 ( 약 1.7e-308 ~ 1.7e+308 ) (대표 실수 타입)
      float  a;
      double  b;
      
      // float 주의사항 ( 리터널 작성 시 반드시 마지막에 f 또는 F 를 추가합니다. )
       a = 1.5F;
       b = 2.5;
       
       System.out.println(a);
       System.out.println(b);
    }
    
    {
       // char
       // 문자
       // 2바이트 ( 유니코드 문자 : 0 ~ 65535 ) 
      char a ='한';
      System.out.println(a);
    }

  }

}
