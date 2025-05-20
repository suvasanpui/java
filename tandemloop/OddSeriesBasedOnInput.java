/*With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples] */

import java.util.Scanner;

public class OddSeriesBasedOnInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number (a): ");
        int a = scanner.nextInt();

        int limit = (a % 2 == 0) ? a - 1 : a;

        System.out.print("Output: ");
        for (int i = 0; i < limit; i++) {
            System.out.print((2 * i + 1));
            if (i < limit - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
