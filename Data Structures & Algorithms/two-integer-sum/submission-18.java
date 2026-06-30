class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevmap = new HashMap<>();

        for(int i = 0; i <nums.length; i++){
            int number = nums[i];
            int diff = target - number;

            if (prevmap.containsKey(diff)){
                return new int[]{prevmap.get(diff), i };
            }
            prevmap.put(number, i);
        } 
        return new int[0];
    }
}
