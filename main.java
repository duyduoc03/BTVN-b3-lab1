package sesstion3.lab1;

public class main {
    public static void main(String args[]){
        Person ps = new Person();
////        ps.ThongTin();
////        ps.IN();
        //nhập
        Student st = new Student();
        System.out.println("Nhập Thông Tin Của Sinh Viên");
        st.ThongTin();

        GiaoVien gv = new GiaoVien();
        System.out.println("Nhập Thông Tin Của Giáo Viên");
        gv.ThongTin();
        //in
        System.out.println("Thông Tin Của Sinh Viên");
        st.IN();
        System.out.println("Thông Tin Của Giáo Viên");
        gv.IN();
    }
}
