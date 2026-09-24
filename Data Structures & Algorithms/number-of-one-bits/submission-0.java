class Solution {
    public int hammingWeight(int n) {
        int set = 0;
        while(n!=0){
            if(n%2==1){
                set++;
        
            }
            n/=2;
        }

        return set;
        

    }
}
