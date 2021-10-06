// Justin Butler 10/6/2021
class Solution {
    public List<Integer> findDuplicates(int[] nums) 
    {
        HashSet<Integer> knownElements = new HashSet(); // holds all known elements
        List<Integer> dups = new ArrayList(); // Only holds duplicate elements
        for(int i = 0; i < nums.length; i++)
        {
            if(!knownElements.contains(nums[i]))
            {
                knownElements.add(nums[i]);
            }
            else
            {
                dups.add(nums[i]);
            }
        }
        return(dups);
    }
}
