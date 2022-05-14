class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set = new HashSet<>();
        HashSet<Integer>list = new HashSet<>();
        for(int e:nums1) set.add(e);
        for(int e:nums2){
            if(set.contains(e)) list.add(e);
        } 
        int answer[] = new int[list.size()];
        int i=0;
        for(int e:list) answer[i++] = e;
        return answer;
    }
}