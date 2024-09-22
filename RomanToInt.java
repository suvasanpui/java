/*Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
    Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4. */
import java.util.Scanner;
public class RomanToInt {
    public static int romanint(char  ch){
        switch(ch){
            case 'I':
            return 1;
            case 'V':
            return 5;
            case 'X':
            return 10;
            case 'L':
            return 50;
            case 'C':
            return 100;
            case 'D':
            return 500;
            case 'M':
            return 1000;
        }
        return ch;
    }
    public static int roman(String s){
        int len=s.length();
        int sum=0;
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if((i+1)<len && romanint(ch)<romanint(s.charAt(i+1))){
                sum=sum-romanint(ch);
            }else{
                sum=sum+romanint(ch);
            }
        }
        return sum;
    }
    public static void main(String [] args){
        Scanner obj=new Scanner(System.in);
        String val;
        System.out.println("Enter String value : ");
        val=obj.nextLine();
        int result=roman(val);
        System.out.println(result);
    }
}
