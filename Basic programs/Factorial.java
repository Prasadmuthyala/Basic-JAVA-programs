import java.util.*;
public class Factorial{
    static int factorial(int n){
        int fact=1;
        if(n==0||n==1){
            return 1;
        }else{
            for(int i=1;i<=n;i++){
                fact=fact*i;
            }
            return fact;
        }
    }
    public static void main(String[] c){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter factorial number : ");
        int n=sc.nextInt();
        int res=factorial(n);
        System.out.println(res);
    }
}