class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int freq[] = new int[26];
        String s1 = s.toLowerCase();
        String t1 = t.toLowerCase();
        for(int i=0;i<s1.length();i++){
            char ch1 = s1.charAt(i);
            freq[ch1-'a']++;
        }
        for(int i=0;i<t1.length();i++){
            char ch1 = t1.charAt(i);
            freq[ch1-'a']--;
        }

        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;

    }
}
