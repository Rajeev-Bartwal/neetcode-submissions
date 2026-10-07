class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        int max_prefix = 0;
        String str = strs[0];
        for(int i=1;i<strs.length;i++){
            
            if(str.charAt(0) != strs[i].charAt(0)) return "";
            else{
                max_prefix++;
            }
        }

        return str.substring(0,max_prefix-1);
    }
}