
import java.util.Scanner;

public class DecimaltoBinary {
    public static int binary(String val){
        int len=val.length();
        int maxval=0,minval=0,res=0;
        for(int i=0;i<len;i++){
            int value=val.charAt(i);
            if(value=='1'){
                maxval+=1;
            }else{
                res=Math.max(res,maxval);
                maxval=0;
            }
            res=Math.max(res, maxval);
        }
        
        return res;
    }
    public static void main(String [] args){
        Scanner obj=new Scanner(System.in);
        StringBuilder mir=new StringBuilder();
        int n;
        System.out.println("Enter a decimal number : ");
        n=obj.nextInt();
        while(n>0){
            mir.insert(0,n%2);
            n=n/2;
        }
        int count=binary((mir.toString()));
        System.out.println(count);
    }
    
}
