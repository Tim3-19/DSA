class Solution {
    int countDigits(int n)//function to count digits
    {
        int count = 0;
        while(n>0)
        {
            count++;//counting digits
            n/=10;
        }
        return count;
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(countDigits(nums[i])%2==0)//checking if the length of the number is even or not
            count++;
        }
        return count;
    }
}