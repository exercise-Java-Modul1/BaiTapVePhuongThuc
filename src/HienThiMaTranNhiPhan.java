import java.util.Random;
import java.util.Scanner;

public class HienThiMaTranNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("mời bạn nhập độ cao của ma trận: ");
        int n = sc.nextInt();
        printMatrix(n);
    }
    static void printMatrix(int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Random rd = new Random();
                int number = rd.nextInt(2);
                array[i][j] = number;
            }
        }
        System.out.println("ma trận có dạng sau: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
