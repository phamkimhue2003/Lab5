import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Lab5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new ArrayDeque<Integer>();
        int n, m;
        System.out.println("Nhap vao n: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao phan tu thu " + (i + 1) + ": ");
            queue.offer(sc.nextInt());
        }
        System.out.println("Queue : " + queue);
        System.out.println("Nhap vao m(m<n): ");
        do {
            m = sc.nextInt();
            if (m > n) {
                System.out.println("Nhap lai m: ");
            }
        } while (m > n);
        for (int i = 0; i < m; i++) {
            System.out.println("Phan tu lay ra thu " + (i + 1) + ": ");
            System.out.println(queue.poll());
        }
    }
}