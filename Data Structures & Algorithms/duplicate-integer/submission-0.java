class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int num:nums){
            set.add(num);
        }
        int sizeofset = set.size();
        if(n==sizeofset){
            return false;
        }
        return true;
    }
}