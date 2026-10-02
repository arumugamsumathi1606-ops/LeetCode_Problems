public class MaximunSubArray_Kadanes {
    public static void main(String[] args)
    {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int CurrentSum = nums[0];
        int maxSum = nums[0];

for (int i=1; i<nums.length; i++)
{
    CurrentSum = CurrentSum + nums[i];
    if (nums[i] > CurrentSum)
    {
        CurrentSum = nums[i];
    }
    if (CurrentSum > maxSum)
    {
        maxSum = CurrentSum;
    }
   
    }
     System.out.println("Maximum sum is: " + maxSum);
}
}