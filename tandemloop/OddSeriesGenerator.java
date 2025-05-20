/*With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples] */

import java.util.Scanner;

public class OddSeriesGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number (a): ");
        int a = scanner.nextInt();

        System.out.print("Output: ");
        for (int i = 0; i < a; i++) {
            System.out.print((2 * i + 1));
            if (i < a - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
