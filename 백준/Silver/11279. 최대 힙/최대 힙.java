import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] heap; 
    static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(reader.readLine()); // 입력 받을 수의 개수
        heap = new int[n + 1]; 
        size = 0; // 초기화
        
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(reader.readLine());
            if (x == 0) {
                if (size == 0) {
                    System.out.println(0); // 힙이 비어있으면 0 출력
                } else {
                    System.out.println(removeMax());
                }
            } else {
                insert(x); 
            }
        }
    }

    // 삽입
    static void insert(int value) {
        heap[++size] = value; 
        int index = size;
        
       
        while (index > 1 && heap[index] > heap[index / 2]) {
            int temp = heap[index];
            heap[index] = heap[index / 2];
            heap[index / 2] = temp;
            index /= 2; 
        }
    }

    //삭제
    static int removeMax() {
        int max = heap[1]; 
        heap[1] = heap[size--]; 
        heapify(1); 
        return max;
    }

    static void heapify(int index) {
        int left = index * 2; 
        int right = index * 2 + 1; 
        int largest = index; 

        if (left <= size && heap[left] > heap[largest]) {
            largest = left;
        }

        if (right <= size && heap[right] > heap[largest]) {
            largest = right;
        }
        
        if (largest != index) {
            int temp = heap[index];
            heap[index] = heap[largest];
            heap[largest] = temp;
            heapify(largest);
        }
    }
}
