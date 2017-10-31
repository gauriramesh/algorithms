public class ContiguousSum {
    //This is the actual question I got asked
    // [6, 3, 5, 21], 8 => true
// [6, 3, 5, 21], 7 => false
// [1, 1, 1], 4 => false

    public boolean hasSum(int [] nums, int target) {

        //Error checking
        if(nums.length == 0) {
            return false;
        }

        if(nums.length == 1) {
            if(nums[0] == target) {
                return true;
            }
            return false;
        }

        //Brute force solution:


        for(int i = 0; i < nums.length; i++) { // i = 0
            int contiguousSum = nums[i];
            for(int j = i + 1; j < nums.length; j++) { // j = 2
                contiguousSum += nums[j]; //2 + 1 = 3
                contiguousSum = Math.abs(contiguousSum); //contiguousSum = 2
                if(contiguousSum > target) { //is 2 > 4? no
                    //We've gone over our target, so this contiguous sum won't work.
                    break;
                }
                else if(contiguousSum == target) { // is 2 == 4? no
                    return true;
                }


            }


        }

        return false;



    }
}
