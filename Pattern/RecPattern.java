package Pattern;
public class RecPattern {
    public static void main(String[] args) {
        int n=7;
        pattern(n,n);
    }
    static void pattern(int n,int m){
        if (n==0){
            n=m-1;
            m=m-1;
            System.out.println();
            if(m==0)
            return;
        }

       System.out.print("* ");
        pattern(n-1,m);

        return;
        

    }
    
}
