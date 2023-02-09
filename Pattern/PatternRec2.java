package Pattern;
public class PatternRec2 {
    
    public static void main(String[] args) {
        int n=5;
        pttn(n,1);
    }
    static void space(int s){
        if(s==0)
        {    
        return;

        }
        System.out.print(" ");
        space(s-1);

    }

    static void str(int s){
        if(s==0)
        {        System.out.println();
        return;

        }
        System.out.print("*");

        str(s-1);
    }

    static void pttn(int n,int m){
        if(n==0)
        return;
        space(n-1);
        str(m);
        pttn(n-1,m+1);
    }
}
