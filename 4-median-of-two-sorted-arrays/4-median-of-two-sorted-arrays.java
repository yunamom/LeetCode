class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double n = 0; int cnt = 0;
       
        int[] nums = new int[nums1.length+nums2.length];
        int i=0;
        for(int e:nums1) nums[i++] = e;
        for(int e:nums2) nums[i++] = e;
        Arrays.sort(nums);
        
        if (i%2 != 0) return nums[i/2];
        
        return (nums[(i/2)-1] + nums[i/2])/2.0 ;
    }
}