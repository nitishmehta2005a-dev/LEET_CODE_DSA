class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int i=0;
        int j=height.length-1;
        int area =0;
        while(i<j){
            if(height[i]>height[j]){
                area = height[j]*(j-i);
                j--;
            }else{
                area = height[i]*(j-i);
                i++;
            }
            if(max < area){
                max = area;
            }
        }
        return max;
    }
}