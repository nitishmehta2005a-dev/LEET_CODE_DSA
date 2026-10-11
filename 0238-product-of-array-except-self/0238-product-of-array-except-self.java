
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        //left multiplication
        ans[0]=1;
        for(int i=1; i<n ;i++){
            ans[i] = ans[i-1] * nums[i-1];
        }
        //right multiplication
        int right = 1;
        for(int i=n-1; i>=0 ; i--){
            ans[i] *= right;
            right *= nums[i];
        }
        return ans;
    }
}