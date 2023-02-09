package Pattern;
import java.util.Scanner;
public class PramidRecPatt {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int num =n.nextInt();
        pattern(1,num);
        n.close();

    }

    

    static void space(int row ,int col){
        if(row==col){
            return;
        }

        System.out.print(" ");
        space(row+1, col);
    }
   
    static void numpatt1(int row,int col)
    {  if(row==col){
        return;
    }
      System.out.print(row);
     numpatt1(row+1, col);
    
    
    }
    static void numpatt(int row ,int col){
         if(row==col){
            return;
         }

          System.out.print(row);
          numpatt(row-1, col);

    }

   static void pattern(int row,int col){
    if(row==col+1){
        return;
    }

    space(1,col-row+1);
    numpatt(row,0);
    numpatt1(2,row+1);
    System.out.println();
    pattern(row+1, col);

   }
    
}
