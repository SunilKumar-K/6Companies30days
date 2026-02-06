class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLength = 0;
        int start = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c) > 1)
            {
                char leftChar = s.charAt(start);
                int val = map.get(leftChar);
                if(val == 1) map.remove(leftChar);
                else map.put(leftChar,val-1);
                start++;
            }
            maxLength = Math.max(maxLength,i-start+1);
            // Set<Character> set = new HashSet<>();
            // int length = 0;
            // for(int j=i;j<s.length();j++)
            // {
            //     if(set.contains(s.charAt(j)))
            //     {
            //         break;
            //     }
            //     set.add(s.charAt(j));
            //     length++;
            // }

            // maxLength = Math.max(maxLength,length);
        }

        return maxLength;
    }
}