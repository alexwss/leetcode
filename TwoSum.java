class Solution {
    //nums = [2,7,11,15]
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int currentMasterIndex = 0; currentMasterIndex < nums.length; currentMasterIndex++) {

            //dont repeat the index element
            if (currentMasterIndex < nums.length) {
                for (int nextPossibleIndex = 0; nextPossibleIndex < nums.length; nextPossibleIndex++) {

                    if (currentMasterIndex != nextPossibleIndex) {
                        int calculated = nums[currentMasterIndex] + nums[nextPossibleIndex];

                        if (calculated == target) {
                            result[0] = currentMasterIndex;
                            result[1] = nextPossibleIndex;
                            return result;
                        }
                    }
                    
                }
                
            }

        }

        return result;
    }
}
