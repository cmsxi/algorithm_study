import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tempInput = (br.readLine()).split(" ");
        System.out.println(Integer.parseInt(tempInput[0]) - Integer.parseInt(tempInput[1]));
    }
}