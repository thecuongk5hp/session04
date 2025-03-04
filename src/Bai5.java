import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên");
        int num;
        do {
            num = sc.nextInt();
            if(num > 0){
                break;
            }
            System.err.println("Số p là số nguyên dương");
        }while (true);
        System.out.printf("Các số hoàn hảo trong khoảng từ 1 đến %d là: \n", num);
        for (int i = 1; i <= num; i++) {
            int sum = 0;
            for(int j = 1; j < i; j++) {
                if(i % j == 0){
                    sum += j;
                }
            }
            if(sum == i){
                System.out.printf("%d\t\n", i);
            }
        }
    }
}