import java.util.Arrays;

class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);//sort the nums
        int left = 0;//this will point to the left side
        int ans = 0;

        for(int right =0 ;right < nums.length;right++){// this will pointer to the right side every turn
            if(nums[right] - nums[left] > 1){//if the answer is more than one move the left pointer to the right
                left++;
            }

            if(nums[right] - nums[left] == 1){//if the answer is one 
                ans = Math.max(ans, right - left + 1);//this will take the biggest lenght found and keep upathing it

            }
        }
        return ans;
    }
}
