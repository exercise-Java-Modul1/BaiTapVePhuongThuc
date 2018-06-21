import java.util.Scanner;

public class SoDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số: ");
        int number = sc.nextInt();
        System.out.println("số mới: " + reverse(number));
    }
    static int reverse(int number) {
        int somoi = 0;
        while (number > 0) {
            somoi = (somoi + number % 10)*10;
            number = (number - number%10) / 10;
        }
        somoi = somoi / 10;
        return somoi;
    }
}
