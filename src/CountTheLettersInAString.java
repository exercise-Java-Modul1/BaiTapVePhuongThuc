import java.sql.SQLOutput;
import java.util.Scanner;

public class CountTheLettersInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn hãy nhập vào một chuỗi: ");
        String letters = sc.nextLine();
        countLetters(letters);
    }
    static int countLetters(String s) {
        char array[] = s.toCharArray();
        System.out.println("In ra các kí tự trong chuỗi: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        int n = array.length;
        System.out.println();
        System.out.println("Chuỗi bạn vừa nhập có " + n + " kí tự.");
        return n;
    }
}
