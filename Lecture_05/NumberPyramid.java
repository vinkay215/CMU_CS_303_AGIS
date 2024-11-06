package Lecture_05;
import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of pyramid rows: ");
        int n = scanner.nextInt();

        System.out.println("Number pyramid: ");
        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= n - i; j++) {
                System.out.print("");  
        // Như ví dụ của thầy thì kim tự tháp sẽ không hiển thị hình tam giác
        // nếu muốn nó hình tam giác thì bỏ khoảng cách vào trong System.out.print(" ");
        // Kết quả hiển thị sẽ là 
        //         1
        //        1 2
        //       1 2 3
        //      1 2 3 4
        //     1 2 3 4 5
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
