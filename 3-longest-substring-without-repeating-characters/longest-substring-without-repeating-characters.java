class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        Map<Character,Integer> map = new HashMap<>();
        int start = 0;
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            while(map.get(s.charAt(i)) > 1)
            {
                int val = map.get(s.charAt(start));
                if(val == 1) {
                    map.remove(s.charAt(start));
                    start++;
                }
                else{
                    map.put(s.charAt(start),val-1);
                    start++;
                }
            }

            maxLength = Math.max(i-start+1,maxLength);
        }

        return maxLength;
    }
}