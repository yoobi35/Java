package chap03_compare;

public class ComparisonEX {

  public static void main(String[] args) {
    
    // 비교 연산 
    
    int x = 10;
    int y = 20;
    
    System.out.println(x > y);     // ----- greater than                 (gt)
    System.out.println(x >= y);    // ----- greater than or equal to     (ge)
    System.out.println(x < y);     // ----- less than                    (lt)
    System.out.println(x <= y);    // ----- less than or equal to        (le)
    System.out.println(x == y);    // ----- equal to                     (eq)
    System.out.println(x != y);    // ----- not equal to                 (ne)
     
    
   // 문자열의 비교 : ==, != 를 사용하지 않습니다.
    String s1 = "abc";  //---------- 문자열 저장소에 "abc"를 저장합니다.
    String s2 = "abc";  //---------- 최적화에 의해서 이미 존재하는 "abc"는 새로 만들지 않습니다.
  
    
  }

}
