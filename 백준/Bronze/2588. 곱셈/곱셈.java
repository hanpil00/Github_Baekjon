import java.util.*;
public class Main { 
  public static void main(String[] args) {
    int A,B,C;
    Scanner sc = new Scanner(System.in);
    A = sc.nextInt();
    B = sc.nextInt();
    System.out.println(A * (B % 10));
    System.out.println(A * ((B % 100) / 10));
    System.out.println(A * (B / 100));
    System.out.println(A * B);
 } 
}