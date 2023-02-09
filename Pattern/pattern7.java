package Pattern;
public class pattern7 {
    static int n=7;
    public static void main(String[] args) {
     
    int m=n/2;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==0 || j==0 || i==n-1 || j==n-1 || i==m && j==m){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    
    }
}
