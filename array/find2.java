/*12-07-2024 find second large element in an unshorted array from user input*/

import java.util.Scanner;
public class find2 {
    public static void main(String [] args){
        int len;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter array size:");
        len=obj.nextInt();
        int arr[]=new int[len];
        int size=arr.length;
        //int arr[]={10,12,18,20,9,6};
        System.out.print("Enter Element : ");
        for(int k=0;k<size;k++){
            arr[k]=obj.nextInt();
        }
        int max=0;
        int max2=0;
        
        for(int i=0;i<len;i++){
            if(max<arr[i]){
                max2=max;
                max=arr[i];
            }
        }
        System.out.println("Second largest element are : "+max2);
    }
}
