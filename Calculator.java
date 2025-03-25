/*
import java.util.*;

public class Calculator{
    
    void sum(int a,int b){
        System.out .println(a+b);
    }
    void sub(int a,int b){
        System.out .println(a-b);
    }
    void multiplication (int a,int b){
        System.out .println (a*b);
    }
    void division(int a,int b){
        System.out .print(a/b);
    }

    public static void main(String[] args){
      
        Scanner scan =new Scanner(System.in);
        int a =scan.nextInt();
        int b = scan.nextInt();
        Calculator obj1 = new Calculator();
        obj1.sum(a,b);
        obj1.sub(a,b);
        obj1.multiplication(a, b);
        obj1.division(a, b);
    }
}*/

//..........using return...............


import java.util.*;

 public class Calculator{
  
    int sum(int a,int b){
        return a+b;
        
    }
    int sub(int a,int b){
        return a-b;
    }
    int multiplication (int a,int b){
        return a*b;
    }
    int division(int a,int b){
       return a/b;
    }

    public static void main(String[] args){
      
        Scanner scan =new Scanner(System.in);
        int a =scan.nextInt();
        int b = scan.nextInt();
        Calculator obj1 = new Calculator();
        System.out .println(obj1.sum(a,b));
        System.out .println(obj1.sub(a,b));
        System.out .println(obj1.multiplication(a, b));
        System.out .println(obj1.division(a, b));
    }
}