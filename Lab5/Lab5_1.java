import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Lab5_1 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so nguyen n: ");
        n=sc.nextInt();
        List<Integer> listNumbers = new ArrayList<>();
        do {
            listNumbers.add(n % 10);
            n = n / 10;
        } while (n > 0);
        // kiểm tra tính thuận nghịch
        int size = listNumbers.size();
        for (int i = 0; i < (size/2); i++) {
            if (listNumbers.get(i) != listNumbers.get(size - i - 1)) {
                System.out.println("Khong la so thuan nghich.");
            }else{
                System.out.println("La so thuan nghich.");
            }
        }
    }
}