/*
 * Write a Calculator class with a single method: int power(int,int). The power method takes two integers,  and , as parameters and returns the integer result of . If either  or  is negative, then the method must throw an exception with the message: n and p should be non-negative.
Sample Input

    4
    3 5
    2 4
    -1 -2
    -1 3
Sample Output

    243
    16
    n and p should be non-negative
    n and p should be non-negative
 */

import java.util.*;

//Write your code here
class Calculator{
    int power(int num,int pow) throws Exception{
        int count=1;
        if(num<0 || pow<0){
            throw new Exception("n and p shuld not be negative");
        }

        for(int i=0;i<pow;i++){
            count=count*num;
        }
        return count; 
    }
}
class ExceptionPower{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

