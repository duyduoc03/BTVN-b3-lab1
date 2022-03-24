package sesstion3.lab1;

public class GiaoVien extends Person{
    String list,cacmon;
    int somon;
    double salary;

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public int getSomon() {
        return somon;
    }

    public void setSomon(int somon) {
        this.somon = somon;
    }

    public String getCacmon() {
        return cacmon;
    }

    public void setCacmon(String cacmon) {
        this.cacmon = cacmon;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void ThongTin(){
        super.ThongTin();
        sc.nextLine();
        System.out.println("Nhập Danh sách lớp: ");
        list = sc.nextLine();
        System.out.println("Nhập Mức Lương: ");
        salary = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập Số Môn Giảng Dạy: ");
        somon = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập Các Môn Giảng Dạy: ");
        cacmon = sc.nextLine();
    }
    public void IN(){
        super.IN();
        System.out.println("\tList Class:\t" + list);
        System.out.println("\tSalary:\t\t" + salary);
        System.out.println("\tSố Môn :\t" + somon);
        System.out.println("\tSố Các :\t" + cacmon);
    }
}
