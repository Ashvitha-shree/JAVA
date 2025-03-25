import java.util.*;
class armstrong{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int temp1=n;
        int temp2=n;
        int a=0,c=0;
        while(temp1>0){
            c++;
            temp1/=10;
        }
        while(temp2>0){
            int rem=temp2%10;
            a+=(int)Math.pow(rem,c);
            temp2/=10;
        }
        if(n==a){
            System.out.print("Armstrong");
        }
    }
}