public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int a = nums.length;
        int[] temp = new int[a];

        int q = 0;
        for (int p=0; p<a-1; p++)
            if (nums[p] != nums[p+1])
                temp[q++] = nums[p];

        temp[q++] = nums[a-1];

        for (int p=0; p<q; p++)
            nums[p] = temp[p];

        return q;
    }
}
