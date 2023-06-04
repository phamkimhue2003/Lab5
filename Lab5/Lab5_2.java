import java.util.Scanner;
import java.util.Stack;

public class Lab5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n, m;
        System.out.println("Nhap vao n: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao phan tu thu " + (i + 1) + ": ");
            stack.push(sc.nextInt());
        }
        System.out.println("Stack : " + stack);
        System.out.println("Nhap vao m(m<n): ");
        do {
            m = sc.nextInt();
            if (m > n) {
                System.out.println("Nhap lai m: ");
            }
        } while (m > n);
        for (int i = 0; i < m; i++) {
            System.out.println("Phan tu lay ra thu " + (i + 1) + ": ");
            System.out.println(stack.pop());
        }
    }
}