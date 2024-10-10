import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine().trim());

        
        for (int i = 0; i < T; i++) {
            String line = br.readLine();
            String[] parts = line.split(" ");
            
            int A = Integer.parseInt(parts[0]);
            int B = Integer.parseInt(parts[1]);
            
            bw.write((A + B) + "\n");
        }
        bw.flush();
        
        br.close();
        bw.close();
    }
}