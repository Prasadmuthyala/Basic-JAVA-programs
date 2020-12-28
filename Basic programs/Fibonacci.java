public class Fibonacci{
    public static void main(String[] x){
        int first=0,second=1,next=0,count=10;
        for(int i=0;i<=count;i++){
            System.out.println(first);
            next=first+second;
            first=second;
            second=next;

        }

    }
}