class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        // int i = 0;
        // int j = s1.length()-1;

    //     while(j < s2.length()){
    //         if(sortIt(s1).equals(sortIt(s2.substring(i,j+1)))) return true;
    //         else{
    //             i++;
    //             j++;
    //         }
    //     }

    //     return false;
    // }

    // String sortIt(String s){
    //     char[] arr = s.toCharArray();  
    //     Arrays.sort(arr);
        
    //     return new String(arr);
    // }

       int[] arr = new int[26];
       int window = s1.length();

       for(char c : s1.toCharArray()) arr[c - 'a']++;

       for(int i=0;i<s2.length();i++){
          
          arr[s2.charAt(i)- 'a']--;

          if(i >= window){
             arr[s2.charAt(i-window) - 'a']++;
          }

          if(allZero(arr)) return true;
       }

       return false;
    }

    boolean allZero(int[] arr){
        for(int i: arr){
            if(i != 0) return false;
        }

        return true;
    }
}
