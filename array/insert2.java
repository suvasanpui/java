/*10/07/2024 insert element in array at a perticular position*/
public class insert2 {
    public static void insertarr(int arr[]){
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]+" ");
        }
    }
    public static void main(String [] args){
        int arr[]={4,8,10,12,16};
        int num=15;
        int index=4;
        int newarr[]=new int[arr.length+1];
        for(int i=0;i<index;i++){
            newarr[i]=arr[i];
        }
        newarr[index]=num;
        for(int j=index ;j<arr.length;j++){
            newarr[j+1]=arr[index];
        }
        insertarr(newarr);
    }
}
