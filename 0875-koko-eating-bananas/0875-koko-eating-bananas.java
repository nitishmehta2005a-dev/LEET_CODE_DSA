class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high = piles[0];
        for (int x : piles) {
           high = Math.max(high, x);
        }
        while(low<=high){
            int mid=low+(high - low)/2;
            long sum=0;
            for(int x:piles){
                sum += ((x+mid-1)/mid);
            }
            if (sum <= h){
                high =mid-1;
            }else{
                low=mid+1;
            }
        }
       return low;  
    }
}