/*
******Maximum Diffrence******
Sample Input

    STDIN   Function
    -----   --------
    3       __elements[] size N = 3
    1 2 5   __elements = [1, 2, 5]
Sample Output

    4
 */
import java.util.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    int len;
    public Difference(int[] arr) {
        this.elements=arr;
    }
    public void computeDifference(){
        len=elements.length;
        int max=elements[0];
        int min=elements[0];
        for(int j=1;j<len;j++){
            if(elements[j]>max){
                max=elements[j];
            }
            if(elements[j]<min){
                min=elements[j];
            }
        }
        maximumDifference=max-min;
    }
} 
public class MaxDiff {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = obj.nextInt();
        }
        Difference mir = new Difference(a);
        mir.computeDifference();
        System.out.println(mir.maximumDifference);
    }
}