class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        int[] count = new int[26];

        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }

        for (int i = 0; i <= s.length() - p.length(); i++) {
            int[] temp = new int[26];

            for (int j = i; j < i + p.length(); j++) {
                temp[s.charAt(j) - 'a']++;
            }

            if (Arrays.equals(count, temp)) {
                ans.add(i);
            }
        }

        return ans;
    }
}