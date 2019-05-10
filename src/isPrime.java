import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        System.out.print("Nhap so can kiem tra: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number<2){
            System.out.println("Dau khong phai so nguyen to!");
        } else {
            int i = 2;
            boolean checkPrime = true;
            while (i<=Math.ceil(Math.sqrt(number))){
                if (number % i == 0){
                    checkPrime = false;
                    break;
                }
                i++;
            }
            if (checkPrime){
                System.out.println("Day la so nguyen to!");
            } else {
                System.out.println("Day khong la so nguyen to!");
            }
        }

    }
}
