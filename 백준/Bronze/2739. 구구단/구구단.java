import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        if(N >= 1 && N <= 9){
            for(int i = 1; i <= 9; i++){
                System.out.println(N + " * " + i + " = " + N*i);
            }
        }
    }
}