package Pattern;
public class Patternec1 {
    public static void main(String[] args) {
        int n=5;
        pattern(1,1,n);
    }
    static void pattern(int n,int m,int r){
        if (n==0){
            
            System.out.println();
            
            if(n==m)
            return;
        }
  
      if(r==m){
        return;
      }

       System.out.print("* ");
        pattern(n+1,m,r);

        return;
    

    }
    
}
