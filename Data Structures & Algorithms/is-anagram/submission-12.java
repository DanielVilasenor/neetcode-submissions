class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        
        Arrays.sort(charS);
        Arrays.sort(charT);
        String ss = new String(charS);
        String tt = new String(charT);

        return ss.equals(tt);
    }
}
