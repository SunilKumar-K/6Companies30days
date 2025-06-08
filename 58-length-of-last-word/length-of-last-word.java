class Solution {
    public int lengthOfLastWord(String s) {
        String words[] = s.split(" ");
        String wor = words[words.length-1];
        return wor.length();
    }
}