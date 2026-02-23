class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        maxSum = nums[0]
        sum = 0
        for i in range(len(nums)):
            
            # for j in range(i,len(nums)):
            #     sum += nums[j]
            #     maxSum = max(maxSum,sum)

            if sum < 0: sum = 0
            sum += nums[i]

            maxSum = max(maxSum,sum)

        return maxSum
