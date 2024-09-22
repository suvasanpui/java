/*10/07/2024 delete element in array at a perticular position*/
public class deletion2 {
    public static void deletearr(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String [] args){
        int arr[]={4,5,8,10,9};
        int index=0;
        for(int i=index;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        deletearr(arr);
    }
}
