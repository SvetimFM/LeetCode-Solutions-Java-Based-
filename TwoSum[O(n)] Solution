import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> sumSearch = new HashMap<>();
        int counter = 0;
        int first = 0, second = 0;
        for(int x : nums) sumSearch.put(x,counter++);
        for(counter=0; counter<nums.length; counter++){
            int tempCandidate = nums[counter];
            if(sumSearch.containsKey(target-tempCandidate)
                &&(sumSearch.get(target-tempCandidate)!= counter)){
                first=counter;
                second=sumSearch.get(target-tempCandidate);
            }
        }
        return new int[]{first,second};
    }
}
