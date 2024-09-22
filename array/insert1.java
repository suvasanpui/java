/*10/07/2024 insert element in array at the last position*/
public class insert1 {
    public static void insertarr(int arr[]){
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]+" ");
        }
    }
    public static void main(String [] args){
        int arr[]={4,5,8,10,9};
        int num=15;
        int newarr[]=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            newarr[i]=arr[i];
        }
        newarr[arr.length]=num;
        insertarr(newarr);
    }
}
