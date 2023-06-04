import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lab5_5 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu: ");
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        Set<Integer> A = new TreeSet<>();
        Set<Integer> B = new TreeSet<>();
        TreeSet<Integer> C = new TreeSet<>();
        for (int num : a) {
            if (A.contains(num)) {
                B.add(num);
            } else {
                A.add(num);
            }
        }
        for (int num : A) {
            if (!B.contains(num)) {
                C.add(num);
            }
        }
        System.out.println("Set:" + A);
        Iterator<Integer> D = C.descendingIterator();
        System.out.println("In ra nhung phan tu chi xuat hien 1 lan trong mang va theo thu tu giam dan:");
        while (D.hasNext()) {
            System.out.println(D.next());
        }
    }
}