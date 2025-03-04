import java.util.Scanner;
public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên dương N: ");
        int n = sc.nextInt();
        System.out.println("Các số Palindrome từ 1 đến " + n + " là:");
        for(int i = 1; i <= n; i++){
            int num = i;
            int reversed = 0;
            int original = num;
            while(num > 0){
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
            if (original == reversed) {
                System.out.print(original + " ");
            }
        }
    }
}