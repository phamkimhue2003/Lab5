import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lab5_4 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap so thu " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        for (int num : a) {
            if (A.contains(num)) {
                B.add(num);
            } else {
                A.add(num);
            }
        }
        System.out.println("Cac phan tu xuat hien 1 lan trong mang: ");
        for (int num : A) {
            if (!B.contains(num)) {
                System.out.println(num);
            }
        }
    }
}