package Pattern;
import java.util.Scanner;
public class AlphaPatternRec {
    static int a=97;
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int num=n.nextInt();
        patt(0,num);
        n.close();
    }

    static void alphapatt(int raw){
        if(raw==-1){
            System.out.println();
            a=97;
            return;
        }
       
        System.out.print((char)a+" ");
        a=a+1;
        alphapatt(raw-1);

    }
    
static void patt(int raw,int col){
    if(raw==col){
        return;
    }
       alphapatt(raw);
       patt(raw+1,col); 
    
}
}
