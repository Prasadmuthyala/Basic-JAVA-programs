import java.util.*;
public class Palindrome{
    static void palindrome(int n){
        int temp =n,sum=0,rem;
        
        while(temp>0){
        rem=temp%10;
        sum=(sum*10)+rem;
        temp=temp/10;
        
        }
        if(sum==n){
            System.out.println(sum+" is a Palindrome");
        } else{
            System.out.println(n+" is not a Palindrome");
        }    
    }
    public static void main(String[] x){
        System.out.println("Enter a value : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        palindrome(n);
    }
}