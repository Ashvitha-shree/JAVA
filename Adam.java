
import java.util.Scanner;

class Adam{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int rev=0,rev1=0;
        int b=a*a;
        
        while(a>0){
            int rem=a%10;
            rev=rev*10+rem;
            a/=10;
        }
        int c=rev*rev;
        while(c>0){
            int rem1=c%10;
            rev1=rev1*10+rem1;
            c/=10;
        }
        
        if(b==rev1){
            System.out.print( "Adam Number" );
        }
        else{
            System.out.print( " not a Adam Number" );
                        
        }
    }
}