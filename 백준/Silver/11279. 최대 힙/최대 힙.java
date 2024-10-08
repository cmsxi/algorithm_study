import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        
        int n = scanner.nextInt(); 
        
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (x == 0) {
                if (maxHeap.isEmpty()) {
                    System.out.println(0); // 힙이 비어있으면 0 출력
                } else {
                    System.out.println(maxHeap.poll()); // 최대값 출력
                }
            } else {
                maxHeap.add(x); // 힙에 값 추가
            }
        }
        
        scanner.close();
    }
}
