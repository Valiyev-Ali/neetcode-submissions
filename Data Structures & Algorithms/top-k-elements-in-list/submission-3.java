class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        //tracks and increments how common is each element(key)
        Map<Integer, Integer> freq = new HashMap<>();
        //for each num in nums it creates or increments to preexisting key the count
        for (int num : nums) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        //converting the HashMap into an ArrayList to sort
        List<Integer> keys = new ArrayList<>(freq.keySet());
        keys.sort((a, b) -> freq.get(b) - freq.get(a));
        for(int i = 0; i < k ; i++) {
            result[i] = keys.get(i);
        }
        return result;
    }
}