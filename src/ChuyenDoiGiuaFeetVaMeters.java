import java.util.Scanner;

public class ChuyenDoiGiuaFeetVaMeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập lựa chọn: ");
        int choise = sc.nextInt();
        switch (choise) {
            case 1:
                System.out.println("footToMeter: ");
                System.out.print("Input feet: ");
                double feet = sc.nextDouble();
                System.out.printf("\t" + "%-15s%s", "feet", "meters" + "\n");
                System.out.printf("\t" + "%-15f%f", feet, footToMeter(feet));
                break;
            case 2:
                System.out.println("meterToFoot: ");
                System.out.print("Input meters: ");
                double meters = sc.nextDouble();
                System.out.printf("\t" + "%-15s%s", "meters", "feet" + "\n");
                System.out.printf("\t" + "%-15f%f", meters, meterToFoot(meters));
                break;
        }
    }
    static double footToMeter(double foot) {
        double meter = 0.305 * foot;
        return meter;
    }

    static double meterToFoot(double meter) {
        double foot = 3.279 * meter;
        return foot;
    }
}
