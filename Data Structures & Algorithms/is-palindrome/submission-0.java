class Solution {
    public boolean isPalindrome(String s) {
        String c = s.toLowerCase();
        int l = 0;
        int r = s.length()-1;
        while(l<=r){
            if(!(Character.isLetterOrDigit(c.charAt(l)))){
                l++;
            }
            else if(!(Character.isLetterOrDigit(c.charAt(r)))){
                r--;
            }
            else{
                if(c.charAt(l)!=c.charAt(r)){
                    return false;
                }
                l++;
                r--;
                
            }
            

        }
        return true;
    }
}
