public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int number = nums.length;

        for (int i = 0; i < number; i++){
            if (nums[i] == val){
                nums[i] = nums[number - 1];
                number--;
                i--;
            }
        }
        return number;
    }
}
