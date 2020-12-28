import java.util.*;
public class PalindromeString{
    static Boolean palindrome(String str){
        int i=0, j=str.length()-1;
         while(i<j){
          if(str.charAt(i)!=str.charAt(j)){
            return false;
           }
        i++;
        j--;
        }
        return true;
    }
    public static void main(String[] c){
     System.out.println("Enter String ") ;  
    Scanner obj=new Scanner(System.in);
    String str=obj.nextLine();
    if(palindrome(str)){
        System.out.println(str+" is Palindrome");
    }else{
        System.out.println(str+" is not Palindrome");
    }

    }
}