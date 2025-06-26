public class FindMissingElement {

    public FindMissingElement() {

    }
    public static int searchMissingElement(int[] nums) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        int low = 0;
        int high =  nums.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2; // to prevent overflow
            if(mid == 0 || (nums[mid] - nums[mid-1] != 1)){
                return nums[mid] - 1;
            } else if(mid == nums.length - 1 || (nums[mid + 1] - nums[mid] != 1)){
                return nums[mid] + 1;
            } else if(nums[mid] == mid + 1){
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,6};
        System.out.println(searchMissingElement(nums));

    }

}

