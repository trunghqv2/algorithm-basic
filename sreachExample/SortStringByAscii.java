import java.util.Arrays;
import java.util.Scanner;

public class SortStringByAscii {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập chuỗi cần sắp xếp: ");
        String input = scanner.nextLine();

        char[] charArray = input.toCharArray();

        Arrays.sort(charArray);

        String sortedString = new String(charArray);

        System.out.println("Chuỗi sau khi sắp xếp: " + sortedString);

        scanner.close();
    }
}