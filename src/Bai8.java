import java.util.Scanner;
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên");
        int num = sc.nextInt();
        System.out.println("Các số Amstrong từ 1 den " + num);
        for(int i = 1; i <= num; i++){
            int n = i, sum = 0, count = 0;
            int temp = n;
            while (temp > 0){
                count++;
                temp /= 10;
            }
            temp = n;
            while (temp > 0){
                int digit = temp % 10;
                sum += (int) Math.pow(digit, count);
                temp /= 10;
            }
            if (sum == i){
                System.out.println(i);
            }
        }
    }
}