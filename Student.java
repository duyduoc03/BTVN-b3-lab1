package sesstion3.lab1;

import java.util.Scanner;

public class Student extends Person{
    String masv,email;
    float diemthi;

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public float getDiemthi() {
        return diemthi;
    }

    public void setDiemthi(float diemthi) {
        this.diemthi = diemthi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void ThongTin(){
        super.ThongTin();
        System.out.println("Nhập Mã Sinh Viên: ");
        masv = sc.next();
        sc.nextLine();
        System.out.println("Nhập Điểm Thi: ");
        diemthi = sc.nextFloat();
        sc.nextLine();
        System.out.println("Nhập Email: ");
        email = sc.next();
    }
    public void IN(){
        super.IN();
        System.out.println("\tMã SV:\t\t" + masv);
        System.out.println("\tĐiểm Thi:\t" + diemthi);
        System.out.println("\tEmail:\t\t" + email);
        if (diemthi > 8) System.out.println("\t\t\t\t\t\tĐạt Học Bổng");
    }
}
