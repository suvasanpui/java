public class Duplicate {
    public static int removeDuplicates(int[] nums) {
        int len=nums.length;
        int conunt=0;
        for(int i=0;i<len;i++){
            if(i<len-1 && nums[i]==nums[i+1]){
                continue;
            }else{
                nums[conunt]=nums[i];
                conunt++;
            }
        }
        return conunt;
        
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2};
        int res=removeDuplicates(arr);
        System.out.println(res);
    }
}
