
import java.util.Scanner;

class Strongnum{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int sum=0;
        int num=scan.nextInt();
        int n=num;
         while(n>0){
            int rem=n%10;
            int fact=1;
            for(int i=1;i<=rem;i++){
                fact=fact*i;
                 
            }
            sum+=fact;
            n/=10;
        }
        
        if(num==sum){
            System.out.print("Strong Number");
        }
        else{
            System.out.print("not a Strong Number");
        }
    }
}