class Solution {
    int count(String s) {
        int[] freq = new int[26];

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int count = 0;

        // Count characters having even frequency
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0 && freq[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}