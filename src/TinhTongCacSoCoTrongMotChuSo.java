import java.util.Scanner;

public class TinhTongCacSoCoTrongMotChuSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số: ");
        int number = sc.nextInt();
        System.out.println("Tổng của các số có trong số " + number + " là: " + sumDigits(number));
    }
    static int sumDigits(int n) {
        int sum = 0;
        do {
            sum = sum + n%10;
            n = (n - n%10) / 10;
        }while (n > 0);
        return sum;
    }
}
