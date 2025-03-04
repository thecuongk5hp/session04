import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap vao so nguyen duong:");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Tong cac so tu 1 den " + n + " la: " + sum);
        scanner.close();
    }
}