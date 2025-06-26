package chap01_arithmetic;

public class ArithmeticEX {

  public static void main(String[] args) {
    
    //  산술 연산
    
    {
    //  정수
    int a = 5 ;
    int b = 2;
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);  
    System.out.println(a % b);
    }
    {
    //  실수
    double a = 5 ;
    double b = 2;
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);  // 나눈 값
    System.out.println(a % b);  // 나눈 나머지
    }
    {
    //  증가
    int a = 10;
    System.out.println(a++);  // 10 (후위 연산 : 출력 후 증가)
    System.out.println(++a);  // 12 (전위 연산 : 증가 후 출력)
    }
    {
     //  감소
     int a = 10;
     System.out.println(a--);  // 10 (후위 연산 : 출력 후 감소)
     System.out.println(--a);  // 12 (전위 연산 : 감소 후 출력)
    }
  }

}
