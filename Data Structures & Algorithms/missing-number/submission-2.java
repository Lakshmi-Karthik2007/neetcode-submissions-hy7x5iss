class Solution {
    public int missingNumber(int[] nums) {
        int expectedxor = 0;
        int n = nums.length;
        int actualxor = 0;
        for(int i=0;i<n;i++){
            expectedxor= expectedxor ^ i;
            actualxor  = actualxor ^ nums[i];
        }

        expectedxor  ^= n;
        int diff = expectedxor^actualxor;

        return diff;
    }
}
