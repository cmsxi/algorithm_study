import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        for(int i = 1; i < input+1; i++){
            for(int j = input-i-1;  j >= 0; j--){
                System.out.print(" ");
            }
            for(int j = 1;  j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}