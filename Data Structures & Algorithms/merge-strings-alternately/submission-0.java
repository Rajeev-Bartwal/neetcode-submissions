class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        String ans = "";

        while( i < word1.length() && j < word2.length()){
           
                ans += word1.charAt(i);
                i++;    
                ans += word2.charAt(j);  
                j++;   
        }

        if(i < word1.length()-1) ans += word1.substring(i);
        if(j < word2.length()-1) ans += word2.substring(j);

        return ans;
    }
}