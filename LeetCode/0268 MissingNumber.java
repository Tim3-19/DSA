class Solution {
    public int missingNumber(int[] nums) {
        int temp[]=new int[nums.length+1];
        temp[0]=-1;

        for(int i =0;i<nums.length;i++)
                  
            temp[nums[i]] = nums[i];
        
        if(temp[0]==-1)
        return 0;

        for(int i =1;i<temp.length;i++)
        {
            if(temp[i]==0)
            return i;
        }
        return -1;

    }
}