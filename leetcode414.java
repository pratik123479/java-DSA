
class Solution {
    public int thirdMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int tmax = Integer.MIN_VALUE;

        int count = 0;

        boolean hasMax = false;
        boolean hasSmax = false;
        boolean hasTmax = false;

        for (int i = 0; i < nums.length; i++) {

            if ((hasMax && nums[i] == max) ||
                (hasSmax && nums[i] == smax) ||
                (hasTmax && nums[i] == tmax)) {
                continue;
            }

            count++;

            if (!hasMax || nums[i] > max) {
                tmax = smax;
                hasTmax = hasSmax;

                smax = max;
                hasSmax = hasMax;

                max = nums[i];
                hasMax = true;

            } else if (!hasSmax || nums[i] > smax) {
                tmax = smax;
                hasTmax = hasSmax;

                smax = nums[i];
                hasSmax = true;

            } else if (!hasTmax || nums[i] > tmax) {
                tmax = nums[i];
                hasTmax = true;
            }
        }

        if (count < 3) {
            return max;
        } else {
            return tmax;
        }
    }
}
