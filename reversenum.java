
import java.util.*;
/*class reversenum{
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
        int  n=scan.nextInt();
        int rev=0;
        while (n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
            }
        System.out.print(rev);
    }
}*/
/*
class reversenum{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        int rev;
        for(rev=0;n!=0;rev=rev*10+(n%10),n/=10);{
              System.out.println(rev);
        }

    }
}*/

class reversenum{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        int rev=0;
        do { 
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        } while (n!=0);
        System.out.print(rev);

    }
}