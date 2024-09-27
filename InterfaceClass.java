/*
Sample Input

    6
Sample Output

    I implemented: AdvancedArithmetic
    12
Explanation
The integer  is evenly divisible by , , , and . Our divisorSum method should return the sum of these numbers, which is . The Solution class then prints  on the first line, followed by the sum returned by divisorSum (which is ) on the second line.
 */
import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int total=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                total=total+i;
            }
        }
        return total;
    }
}

class InterfaceClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        
        System.out.println(sum);
    }
}