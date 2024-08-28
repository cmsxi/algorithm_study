import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] temps = input.trim().split(" ");
        System.out.println(temps.length == 1 && temps[0].isEmpty() ? 0 : temps.length);
    }
}