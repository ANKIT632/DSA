package Pattern;
import java.util.*;
import java.io.*;

public class PatternSeries {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner n=new Scanner(System.in);
    int a=n.nextInt();
  
    for(int i=1;i<=a;i++){
      int b=n.nextInt();

      rec(b);
    
    }
    n.close();
    
  }
    

  
  public static void rec(int n){
    
      if(n<=0){
        System.out.print(n+" ");
        return;
      }
        System.out.print(n+" ");

      n=n-5;
      rec(n);
      n=n+5;
    System.out.print(n+" ");
  return;
  }
}