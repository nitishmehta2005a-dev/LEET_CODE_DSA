class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] arr={-1,-1};
        int first=-1;
        int last=-1;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(target==nums[mid]){
             first =mid;
             j=mid-1;
            }else if(target>nums[mid]){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
            i=0;
            j=nums.length-1;
         while(i<=j){
            int mid=i+(j-i)/2;
            if(target==nums[mid]){
             last =mid;
             i=mid+1;
            }else if(target>nums[mid]){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        arr[0]=first;
        arr[1]=last;
        return arr;
    }
}