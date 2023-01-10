import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int x = findNextPrime(m);
    int y = findNextPrime(x+1);
    int N = y-x-1;
    System.out.println(m+" - " +n+ " : " +N);
  }
  public static int findNextPrime(int num){
      while(!isPrime(num)){
          num++;
      }
      return num;
  }
  public static boolean isPrime(int a) {
    if (a < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(a); i++) {
      if (a % i == 0) {
        return false;
      }
    }
    return true;
  }
}
