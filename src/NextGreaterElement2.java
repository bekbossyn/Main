public class NextGreaterElement2 {

    public int[] nextGreaterElements(int[] nums) {
        int[] pos = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            pos[i] = i;

        int[] inds = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int ind = pos[i];
            while (ind < nums.length && nums[ind] <= nums[i]) ind++;
            if (ind < nums.length) {
                inds[i] = nums[ind];
            }   else {
                ind = 0;
                while (ind < nums.length && nums[ind] <= nums[i]) ind++;
                if (ind < nums.length){
                    inds[i] = nums[ind];
                } else
                    inds[i] = -1;
            }
        }
        return inds;
    }

}
