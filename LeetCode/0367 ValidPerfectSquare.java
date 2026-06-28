//Time Complezity: O(sqrt(n))
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<=0)
        return false;
        for(long i =1;i*i<=num;i++)//IMP to use long or for big numbers i will get overflowed
        {
            if(i*i==num)
            return true;
        }
        return false;
    }
}

/*
TC : O(logN)
class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 1) 
        return false;

        long left = 1;
        long right = num;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return false;
    }
}
*/