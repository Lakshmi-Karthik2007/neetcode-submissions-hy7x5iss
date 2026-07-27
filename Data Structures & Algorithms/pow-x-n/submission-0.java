class Solution {
    public double myPow(double x, int n) {
        double sol = 1;
        if(n>0){
            for(int i=1;i<=n;i++){
                sol = sol*x;
            }
        }
        else{
            for(int i=0;i<n*-1;i++){
                sol = sol/x;
            }
        }

        return sol;
    }
}
