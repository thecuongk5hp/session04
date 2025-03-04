import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 số n");
        int n = Math.abs(sc.nextInt());
        int sum = 0;
        while (n > 0){
            int temp = n % 10;
            sum += temp;
            n = n / 10;
        }
        System.out.println("Tổng các số của n là: " + sum);
    }
}