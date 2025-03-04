import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 số nguyên:");
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("Số nhập vào không hop lệ");
        }else{
            System.out.printf("Bảng cửu chương %d\n", n);
            for(int i = 1; i <= 10; i++){
                System.out.printf("%d x %d = %d\n", n, i, (n * i));
            }

        }
    }
}