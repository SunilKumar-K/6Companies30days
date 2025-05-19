class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length() > s.length()) return new ArrayList<>();

        Map<Character,Integer> sMap = new HashMap<>();
        Map<Character,Integer> pMap = new HashMap<>();

        for(int i=0;i<p.length();i++)
        {
            sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0;i<p.length();i++)
        {
            pMap.put(p.charAt(i),pMap.getOrDefault(p.charAt(i),0)+1);
        }

        List<Integer> list = new ArrayList<>();

        if(sMap.equals(pMap)) list.add(0);
        int k = 0;
        for(int i=p.length();i<s.length();i++)
        {
            sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i),0)+1);
            
            int val = sMap.get(s.charAt(k));
            if(val == 1) {
                sMap.remove(s.charAt(k++));
            }
            else{
                sMap.put(s.charAt(k++),val-1);
            }

            if(sMap.equals(pMap)){
                list.add(k);
            }
        }

        return list;

    }
}