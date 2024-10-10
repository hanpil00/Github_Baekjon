import java.util.*;

public class Main {
    public static void main(String[] args) {
        int nyeondo;
        Scanner sc = new Scanner(System.in);
        nyeondo = sc.nextInt();
        if(nyeondo >= 1 && nyeondo <= 4000){
            if((nyeondo % 4 == 0 && nyeondo % 100 != 0) || (nyeondo % 400 == 0)){
                System.out.println("1");
            } else
                System.out.println("0");
        }
    }
}