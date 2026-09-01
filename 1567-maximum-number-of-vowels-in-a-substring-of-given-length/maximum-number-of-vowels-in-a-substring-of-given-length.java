class Solution {
    boolean isVowel(char ch)
     {
        return "aeiou".indexOf(ch)!=-1;
     }
    public int maxVowels(String s, int k) {

        int count = 0;
        int maxCount = 0;

    
        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);

            if(isVowel(ch))
                count++;
            
        }

        maxCount = count;

        // Move the sliding window
        for (int i = k; i < s.length(); i++) {

            char add = s.charAt(i);
            char remove = s.charAt(i - k);

            if(isVowel(add)) {
                count++;
            }

            if(isVowel(remove)) {
                count--;
            }
        

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}