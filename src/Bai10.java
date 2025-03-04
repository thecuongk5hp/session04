import java.util.Scanner;
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("----------------MENU----------------");
            System.out.println("1. Kiểm tra số nguyên tố");
            System.out.println("2. Kiểm tra số hoàn hảo");
            System.out.println("3. Tìm và tính tổng tất cả các ước của một số");
            System.out.println("4. Thoát");
            System.out.printf("Lựa chọn của bạn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập vào 1 số");
                    int n = sc.nextInt();
                    boolean isPrime = true;
                    if(n < 2){
                        System.out.println("Không phải số nguyên tố");
                    }else{
                        for(int i = 2; i <= Math.sqrt(n); i++){
                            if(n % i == 0){
                                System.out.printf("%d không phải là số nguyên tố\n", n);
                                isPrime = false;
                            }
                        }
                        if(isPrime){
                            System.out.printf("%d là số nguyên tố\n", n);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Nhập vào 1 số");
                    int num = sc.nextInt();
                    int sumDivisors = 0;
                    for (int i = 1; i < num; i++) {
                        if(num % i == 0){
                            sumDivisors += i;
                        }
                    }
                    if(sumDivisors == num){
                        System.out.printf("Số %d là số hoàn hảo\n", num);
                    }else{
                        System.out.printf("Số %d không là số hoàn hảo\n", num);
                    }
                    break;
                case 3:
                    System.out.println("Nhập vào 1 số");
                    int number = sc.nextInt();
                    int sum = 0;
                    System.out.println("Các ước số của " + number + " là");
                    for (int i = 1; i <= number; i++) {
                        if(number % i == 0){
                            System.out.println(i);
                            sum += i;
                        }
                    }
                    System.out.printf("Tổng các ước của số %d là: %d\n", number, sum);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Vui long nhập lài từ 1 đến 4");
            }
        }while (true);
    }
}