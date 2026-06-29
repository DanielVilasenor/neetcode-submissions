class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length() ){
            return false;
        }
        //sort characters into array
        char [] sSort = s.toCharArray();
        char [] tSort = t.toCharArray();
        //perform the sort
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        //does s array = t array
        if (Arrays.equals(sSort,tSort)){
            return true;
        }
        return false;
    }
}
