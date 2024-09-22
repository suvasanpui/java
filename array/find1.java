/*12-07-2024 find second large element in an unshorted array*/
public class find1 {
    public static void main(String [] args){
        int arr[]={10,12,18,20,9,6};
        int max=0;
        int max2=0;
        int size=arr.length;
        for(int i=0;i<size;i++){
            if(max<arr[i]){
                max2=max;
                max=arr[i];
            }
        }
        System.out.println(max2);
    }
}
