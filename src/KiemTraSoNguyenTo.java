import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc =new  Scanner(System.in);
        System.out.print("Bạn muốn kiểm tra bao nhiêu số bắt đầu từ 1?: ");
        int number = sc.nextInt();
        for (int i = 2; i < number; i++) {
            Songuyento(i);
        }
        Songuyento(number);
    }
    static void Songuyento(int number) {
        int dem = 0;
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println(number + " là số nguyên tố.");
        } else {
            System.out.println(number + " không phải là số nguyên tố.");
        }
    }
}
