import java.util.*;
public class FactorialRecur{
    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] b){
        System.out.println("Enter factorial : ");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }
}