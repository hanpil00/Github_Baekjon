import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = N / 4;  
       
        for (int i = 0; i < count - 1; i++) {
            System.out.print("long ");
        }
        
        if (count > 0) {
            System.out.print("long int");
        }
        
        sc.close();
    }
}