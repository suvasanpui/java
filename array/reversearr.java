/*10/07/2024 reverse an array */
public class reversearr {
    public static void deletearr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String [] args){
        int arr[]={4,5,8,10,9,15};
        int frist=0;
        int last=arr.length-1;
        while(frist<last){
            int temp=arr[frist];
            arr[frist]=arr[last];
            arr[last]=temp;
            frist++;
            last--;
        }
        deletearr(arr);
    }
}
