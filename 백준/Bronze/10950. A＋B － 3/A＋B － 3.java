import java.util.*;

public class Main {
    public static void main(String[] args) {
        int EA;
        Scanner sc = new Scanner(System.in);
        EA = sc.nextInt();
        for(int i = 0; i < EA; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A+B);
        }
    }
}