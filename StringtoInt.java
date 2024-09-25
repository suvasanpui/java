/*
 * Read a string, , and print its integer value; if  cannot be converted to an integer, print Bad String.
Sample Input 0

    3
Sample Output 0

    3
Sample Input 1

    za
Sample Output 1

    Bad String
*/
import java.util.*;

public class StringtoInt {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String val=obj.nextLine();
        StringBuilder mir=new StringBuilder();
        int num;
        try {
            num=Integer.parseInt(val);
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("invalid string");
        }
    }
}
