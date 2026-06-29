class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs){
            char [] sSort = s.toCharArray();
            Arrays.sort(sSort);
            String sublist = new String(sSort);
            map.putIfAbsent(sublist, new ArrayList<>());
            map.get(sublist).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
