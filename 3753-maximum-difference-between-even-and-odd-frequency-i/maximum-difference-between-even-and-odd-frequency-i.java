
class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer> freq = new HashMap<>();

        for(char ch : s.toCharArray())
        {
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }


        int oddMax =0;
        int evenMax = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;
        for(int value : freq.values())
        {
            if(value % 2 == 0 ) 
            {
                evenMax = Math.min(evenMax,value);
            }
            else{
                oddMax = Math.max(oddMax,value);
            }
        }

        return oddMax - evenMax;
    }
}