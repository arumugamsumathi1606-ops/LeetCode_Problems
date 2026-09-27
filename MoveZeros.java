public class MoveZeros {
    public static void main(String[] args)
    {
int[] nums = {0,1,0,3,12};
int results = 0;

for (int i=0; i<nums.length; i++)
    {
if (nums[i] != 0)
{
    
    nums[results] = nums[i];
    results++; // non zero element found, increment results
}
    }

for (int i=results; i<nums.length; i++)
    {
    nums[i] = 0;
    }
System.out.println("The final array is: ");
for (int i=0; i<nums.length; i++)
    {
    System.out.print(nums[i] + " ");
    }
}
}