package sesstion3.lab1;

import java.util.Scanner;

public class Person {
    String name,gioitinh,ngaysinh,diachi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    Scanner sc = new Scanner(System.in);

    public void ThongTin(){
        System.out.println("Nhập Tên: ");
        name = sc.nextLine();
        System.out.println("Nhập Giới Tính: ");
        gioitinh = sc.next();
        sc.nextLine();
        System.out.println("Nhập Ngày Sinh: ");
        ngaysinh = sc.nextLine();
        System.out.println("Nhập Địa Chỉ: ");
        diachi = sc.nextLine();
    }
    public void IN(){
        System.out.println("\tTên:\t\t" + name);
        System.out.println("\tGiới Tính:  " + gioitinh);
        System.out.println("\tNgày Sinh:  " + ngaysinh);
        System.out.println("\tĐịa Chỉ:\t" + diachi);
    }
}
