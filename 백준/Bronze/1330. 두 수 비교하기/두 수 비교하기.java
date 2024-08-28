import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tempInput = (br.readLine()).split(" ");
        int first = Integer.parseInt(tempInput[0]);
        int second = Integer.parseInt(tempInput[1]);
        if(first>second) {
            System.out.println(">");
        } else if (first==second) {
            System.out.println("==");
        }else{
            System.out.println("<");
        }
    }
}