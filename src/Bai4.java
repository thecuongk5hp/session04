import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1, sum = 0;
        while(num != 0){
            System.out.println("Nhập 1 số");
            num = sc.nextInt();
            sum += num;
        }
        System.out.println("Tổng các số là: " + sum);
    }
}