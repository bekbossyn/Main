public class NextGreaterElement1 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] pos = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            pos[i] = 0;
            while (nums1[i] != nums2[pos[i]])
                pos[i]++;
        }
        int[] inds = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int ind = pos[i];
            while (ind < nums2.length && nums2[ind] <= nums1[i]) ind++;
            if (ind < nums2.length)
                inds[i] = nums2[ind];
            else
                inds[i] = -1;
        }
        return inds;
    }

}
