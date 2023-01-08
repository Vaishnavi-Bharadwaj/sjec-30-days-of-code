import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int sum=0;
		for(int j=0;j<n;j++){
		    sum=sum+a[j];
		}
		float avg=sum/n;
		for(int k=0;k<n;k++){
		    if(a[k]>avg)
		        System.out.println(a[k]);
		}
		    
	}
	
}