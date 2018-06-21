import java.util.Scanner;

public class HienThiSoPentagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn hãy nhập một số nguyên: ");
        int number = sc.nextInt();
        System.out.println("Số Pentagonal tương ứng với số nguyên " + number + " là: " + getPentagonalNumber(number));
    }
    static int getPentagonalNumber(int n) {
        int Pentagonal = 0;
        if (n >= 1) {
            Pentagonal = n*(3*n - 1) / 2;
        }
        return Pentagonal;
    }
}
