import java.util.Scanner;

class Average1 {
    int frist, middle, last;

   Average1(int a, int b, int c) {
        frist = a;
        middle = b;
        last = c;
    }

    void display() {
        int result = ((frist + middle + last) / 3);
        System.out.println(result);
    }
}

public class Test1 {
    public static void main(String[] args) {
        int x, y, z;
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter Frist value");
        x = obj1.nextInt();
        System.out.println("Enter second value");
        y = obj1.nextInt();
        System.out.println("Enter third value");
        z = obj1.nextInt();
        Average1 obj2 = new Average1(x, y, z);
        System.out.println("This number average is : ");
        obj2.display();
    }
}