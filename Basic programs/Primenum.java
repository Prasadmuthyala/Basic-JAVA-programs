
//Before the taking Scanner import java Packages
import java.util.*;

public class Primenum{
    public static void main(String[] x){
        //For the taking input from user 
        Scanner scan=new Scanner(System.in);
        //taking only input datatype
        int n=scan.nextInt();
        //logic of the code 
        int flag=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("prime number");
        }else{
            System.out.println("NOT a prime number");
        }

    }
 
}