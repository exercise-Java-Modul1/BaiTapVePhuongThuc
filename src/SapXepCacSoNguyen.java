import java.util.Scanner;

public class SapXepCacSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn muốn xắp xếp bao nhiêu số: ");
        int n = sc.nextInt();
        int[] array = new  int[n];
        System.out.println("Mời bạn nhập vào " + n + " số:");
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            array[i] = number;
        }
        displaySortedNumbers(array);
    }
    static void displaySortedNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("xắp xếp theo thứ tự giảm dần: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
