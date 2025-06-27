package chap02_loop;

public class ForEX {

  public static void main(String[] args) {
    
    
    // 1~100 누적하기 
    int total = 0;
    for ( int x = 1 ; x <= 100; x++) {
      total += x;
    }
    System.out.println(total);
    
    
    // 1 ~ 100 홀수의 평균 ( 합계 / 개수)
    int oddTotal= 0 ;
    int oddCount=0;
    double oddAverage;
    for (int y =1 ; y <=100; y++) {
     if(y%2==1) {
       oddTotal += y;
       oddCount++;
     }
    }
   
    oddAverage = (double)oddTotal / oddCount;  // ---- oddTotal을 double로 casting하면 , oddCount는 double로 promotion 됩니다. 
    System.out.println(oddAverage);
    
  }

}
