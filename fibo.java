
import java.util.Scanner;

class fibo{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        for (int i=1;i<=n;i++){
               System.out.print((int)(Math.pow(i,2)+Math.pow(i,3))+" ");
        }
    }
}