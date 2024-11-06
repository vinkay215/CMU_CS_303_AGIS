import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Info có sẵn
        String name = "Nguyễn Quốc Vinh";
        String Nickname = "Vinkay";
        String className = "CMU_CS 303 AGIS";
        String studentId = "29219051305";

        // Menu 
        System.out.println("Chọn một tùy chọn:");
        System.out.println("1. Xem thông tin có sẵn");
        System.out.println("2. Nhập thông tin mới");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng mới

        switch (choice) {
            case 1:
                // In thông tin có sẵn
                System.out.println("Thông tin sinh viên:");
                System.out.println("Họ và tên: " + name);
                System.out.println("Nick Name: " + Nickname);
                System.out.println("Lớp: " + className);
                System.out.println("Mã sinh viên: " + studentId);
                break;
            case 2:
                // nhập thông tin
                System.out.print("Nhập họ và tên: ");
                String newName = scanner.nextLine();
                System.out.print("Nhập lớp: ");
                String newClass = scanner.nextLine();
                System.out.print("Nhập mã sinh viên: ");
                String newStudentId = scanner.nextLine();

                // in ra các giá trị nhập vào từ bàn phím
                System.out.println();
                System.out.println("Thông tin sinh viên:");
                System.out.println("Họ và tên: " + newName);
                System.out.println("Lớp: " + newClass);
                System.out.println("Mã sinh viên: " + newStudentId);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn 1 hoặc 2.");
        }

        scanner.close();
    }
}
