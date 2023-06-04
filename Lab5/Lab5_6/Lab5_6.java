package Lab5_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab5_6 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        Map<Integer,SinhVien> map = new HashMap<Integer,SinhVien>();
        System.out.println("Nhập số sinh viên: ");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            SinhVien sv = new SinhVien();
            System.out.println("Nhập sinh viên thứ "+(i+1)+": ");
            sv.Nhap();
            map.put(i, sv);
        }
        System.out.println("\nDs sinh viên: ");
        for (SinhVien temp : map.values()) {
            System.out.println(temp);
        }
        sc.nextLine();
        String lop_temp;
        System.out.print("\nNhap lop can tim: ");
        lop_temp = sc.nextLine().toUpperCase();
        int dem = 0;
        for (SinhVien temp : map.values()){
            dem++;
            if(temp.getLop().equals(lop_temp)){
                System.out.println(temp);
                break;
            }
            else if(dem>=n) System.out.println("Khong tim thay!");
        }
        String msv_temp;
        System.out.println("\nNhap ma sinh vien can tim: ");
        msv_temp = sc.nextLine().toUpperCase();
        int dem1=0;
        for (SinhVien temp : map.values()){
            dem1++;
            if(temp.getMsv().equals(msv_temp)){
                System.out.println("Ho ten: "+temp.getHoten()+"\tLop: "+temp.getLop());
                break;
            }
            else if(dem1>=n) System.out.println("Khong tim thay!");
        }
    }
    
}
