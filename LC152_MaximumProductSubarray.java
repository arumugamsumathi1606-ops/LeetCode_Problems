public class LC152_MaximumProductSubarray {
   public static void main(String[] args)
    {
        int[] nums = {2,3,-2,4}; //2*3 =6 ; 3*-2 = -6 ; -2*4 = -8 ; 2*3*-2 = -12 ; 3*-2*4 = -24 ; 2*3*-2*4 = -48
        int CurrentProduct = nums[0];
        int maxProduct = nums[0];
    
        for (int i=1 ; i<nums.length; i++)
        {
            CurrentProduct = CurrentProduct * nums[i];
            if(nums[i] > CurrentProduct)
                {
                    CurrentProduct = nums[i];
                }
            if(CurrentProduct > maxProduct)
                {
                    maxProduct = CurrentProduct;
                }
        }
        System.out.println("Maximum product is: " + maxProduct);
    }

}
