package Pattern;
import java.util.Scanner;
public class RecTriPattern {
    static int p=0;
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int num=n.nextInt();
        patt(1,num);
        n.close();
    }


    static void nump(int n){
        if(n==0)
        {
            System.out.println();
            return;
        }p=p+1;

       System.out.print(p+" ");
        nump(n-1);
    }

    static void patt(int n1,int n2){
      if(n1==n2)
        {
            return;
        }

       nump(n1);
      patt(n1+1,n2);   
}
}
