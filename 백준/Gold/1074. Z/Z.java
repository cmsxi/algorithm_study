import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int inputN = Integer.parseInt(inputs[0]);
        int inputRow = Integer.parseInt(inputs[1]);
        int inputCol = Integer.parseInt(inputs[2]);


        System.out.println(solution(inputN, inputRow, inputCol));
    }

    public static int solution(int N, int row, int col) {
        if (N < 1) return 0;

        int powerOf2ByN = (int) Math.pow(2, N - 1);

        if (row < powerOf2ByN && col < powerOf2ByN) return solution(N - 1, row % powerOf2ByN, col % powerOf2ByN);
        else if (row < powerOf2ByN && col >= powerOf2ByN) return powerOf2ByN*powerOf2ByN + solution(N - 1, row % powerOf2ByN, col % powerOf2ByN);
        else if (row >= powerOf2ByN && col < powerOf2ByN) return  powerOf2ByN*powerOf2ByN*2 + solution(N - 1, row % powerOf2ByN, col % powerOf2ByN);
        else if (row >= powerOf2ByN && col >= powerOf2ByN) return  powerOf2ByN*powerOf2ByN*3 + solution(N - 1, row % powerOf2ByN, col % powerOf2ByN);
        return -1;
    }


}
