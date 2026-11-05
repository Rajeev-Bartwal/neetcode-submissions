

class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> mp = new HashMap<>();

        // Store frequency of characters in t
        for (char c : t.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int count = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (mp.getOrDefault(ch, 0) > 0) {
                count--;
            }

            mp.put(ch, mp.getOrDefault(ch, 0) - 1);

            // Valid window found
            while (count == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                mp.put(leftChar, mp.get(leftChar) + 1);

                if (mp.get(leftChar) > 0) {
                    count++;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? "" : s.substring(start, start + minLen);
    }
}
