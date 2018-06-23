import java.util.Scanner;

public class TinhDienTichHinhTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài cạnh thứ nhất: ");
        double a = sc.nextDouble();
        System.out.print("Nhập độ dài cạnh thứ hai: ");
        double b = sc.nextDouble();
        System.out.print("Nhập độ dài cạnh thứ ba: ");
        double c = sc.nextDouble();
        if (isValid(a, b, c) == true) {
            System.out.println("Diện tích của tam giác có 3 cạnh lần lượt là " + a + " " + b + " " + c + " bằng: " + area(a, b, c));
        } else {
            System.out.println("Đây không phải là 3 cạnh của một tam giác.");
        }

    }
    static boolean isValid(double side1, double side2, double side3) {
        if (side1 > 0 && side2 > 0 && side3 > 0) {
            System.out.println("Đây là 3 cạnh của một tam giác.");
            return true;
        } else {
            return false;
        }
    }
    static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
        return area;
    }
}
