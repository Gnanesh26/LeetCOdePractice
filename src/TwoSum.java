import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //     public int[] twoSum(int[] nums, int target) {
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++)
// {
//     if(nums[i]+nums[j]==target){
//         return new int[]{i,j};
//     }
// }        }
//         return nums;
//     }
// }
    class Solution {
        public int[] twoSum(int[] nums, int target) {


            Map<Integer, Integer> c = new HashMap<>();


            for (int i = 0; i < nums.length; i++) {
                Integer ci = c.get(nums[i]);
                if (ci != null) {
                    return new int[]{i, ci};
                }

                c.put(target - nums[i], i);

            }

            return nums;
        }
    }
}