import java.util.*;

public class Main {
    public static void main(String[] args) {
        int h, m;
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        m = sc.nextInt();
        if(m < 45){
           h--;
           m = 60 + m - 45;
           if(h < 0){
               h = 23;
           } 
        }else {
            m = m - 45;
        }
        
        System.out.println(h + " " + m);
    }
}