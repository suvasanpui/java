class MaxsubArray {
    public  static int max2SubArray(int[] nums) {
        int arr[]=nums;
        int len=arr.length;
        int sum=0;
        int max=arr[0];
        for(int i=0;i<len;i++){
            sum += arr[i];
            if(sum<0){
                sum=0;
            }
            if(sum>max){
                max=sum;
            }
        }
        return sum;
    }
    public static void main(String []args){
        int arr[]={5,4,-1,7,8};   
        int result= max2SubArray(arr);
        System.out.println(result);
    }
}