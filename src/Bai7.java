import java.util.Scanner;
public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên");
        int num = sc.nextInt();
        System.out.println("Các số Happy từ 1 den " + num);
        for(int i = 1; i <= num; i++){
            int n = i;
            while (n != 1 && n != 4){
                int sum = 0;
                int temp = n;
                while (temp > 0){
                    int digit = temp % 10;
                    sum += digit * digit;
                    temp = temp / 10;
                }
                n = sum;
            }
            if(n == 1){
                System.out.println(i + " ");
            }
        }
    }
}