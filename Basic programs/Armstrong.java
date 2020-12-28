import java.util.*;
import java.lang.Math;
public class Armstrong{
    public static void main(String[] c){
        Scanner jc =new Scanner(System.in);
        System.out.println("Enter num : ");
        int i=jc.nextInt();
        int temp=i,count=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        temp=i;
        int sum=0;
        double r;
        while(temp>0){
            
            r=temp%10;
            temp=temp/10;
            sum=sum+(int)(Math.pow(r, count));
            
        }
        if(sum==i){
            System.out.println(sum+ " is a Armstrong number");
        }else{
            System.out.println(sum+" is Not a Armstrong number" );
        }
        

    }
}