public class LC152_MaximumProductSubarray {
   public static void main(String[] args)
    { //basically to find continous subarry of multiplication give maxProduct.. for product track both postive and negative validations
        int[] nums = {2,3,-2,4}; //2*3 =6 ; 3*-2 = -6 ; -2*4 = -8 ; 2*3*-2 = -12 ; 3*-2*4 = -24 ; 2*3*-2*4 = -48
        int currentProductMax = nums[0];//2, Best valus we get at the end
        int currentProductMin = nums[0]; //Negative   * neg = postive as well 
        int maxProduct = nums[0]; //positive - works throughout the end
        for (int i=1 ; i<nums.length ; i++)
        { //oldCurrentProductMax = 2 stored , Now we will multiply with next value 3 and -2 and 4 so need to store the same in a new variable
        //  int oldCurrentProductMax = currentProductMax;//arr[0] = 2
        //     int oldCurrentProductMin = currentProductMin;//arr[0] = 2
        //     int num = nums[i];//{2,3,-2,4};
        //     //nums[1] = 3 ; nums[2] = -2 ; nums[3] = 4 
         int num = nums[i];//{2,3,-2,4};
            int product1 = currentProductMax * num;//2*3 = 6 ; 6*-2 = -12 ; -12*4 = -48
            int product2 = currentProductMin * num;//2*3 = 6 ; 6*-2 = -12 ; -12*4 = -48
            //find max
currentProductMax = num;
if (product1 > currentProductMax)
{
    currentProductMax = product1;
}
if (product2 > currentProductMax)
{
    currentProductMax = product2;
}
            //find min
currentProductMin = num;
if (product1 < currentProductMin)
{
    currentProductMin = product1;
}
if (product2 < currentProductMin)
{
    currentProductMin = product2;
}
            //update maxProduct
if (currentProductMax > maxProduct)
{
    maxProduct = currentProductMax;
}

        }

        System.out.println("Maximum product is: " + maxProduct);
    }

}
