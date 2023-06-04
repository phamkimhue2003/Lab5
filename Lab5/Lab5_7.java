import java.util.ArrayList;
import java.util.Scanner;

public class Lab5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Object> a = new ArrayList();
        System.out.print("Nhap 1 so nguyen: ");
        a.add(sc.nextInt());
        System.out.print("Nhap 1 so thuc: ");
        a.add(sc.nextFloat());
        System.out.print("Nhap 1 chuoi: ");
        sc.nextLine();
        a.add(sc.nextLine());
        System.out.println("Nhap 1 gia tri boolean(true or false): ");
        a.add(sc.nextBoolean());
        System.out.println("In ra ArrayList:" + a);
    }
}
