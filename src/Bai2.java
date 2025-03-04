import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 số nguyên:");
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n < 2){
            System.out.println("Không phải số nguyên tố");
        }else{
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    System.out.printf("%d không phải là số nguyên tố", n);
                    isPrime = false;
                }
            }
            if(isPrime){
                System.out.printf("%d là số nguyên tố", n);
            }
        }
    }
}
