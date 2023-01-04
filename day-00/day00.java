import java.util.*;
import java.lang.*;
import java.io.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Name:");
        String Name=sc.nextLine();
        if(Name.equals("")) // .equals() is used to comapre strings in java, or if(Name.length()==0)
            System.out.println("Hello, SJEC!");
        else
            System.out.println("Hello, "+Name+"!");

    }
}