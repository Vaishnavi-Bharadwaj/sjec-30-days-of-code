import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            
            if(i%3==0)
                System.out.println("Foo");
            else if(i%2==0 && i%3!=0)
                System.out.println("Bar");
            else
                System.out.println("Baz");
        }
    }
}