import java.util.Scanner;

public class NumberOfDaysInAYear {
    public static void main(String[] args) {
       numberOfDaysInAYear();
    }
    static int numberOfDaysInAYear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn tính từ năm bao nhiêu đến năm bao nhiêu?");
        System.out.print("từ năm: ");
        int year1 = sc.nextInt();
        System.out.print("đến năm: ");
        int year2 = sc.nextInt();
        int year = (year2 - year1 + 1);
        int days = 365*year;
        System.out.println("Từ năm " + year1 + " đến năm " + year2 + " có " + days + " ngày.");
        return days;
    }
}
